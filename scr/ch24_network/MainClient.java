package ch24_network;
/*   프로토콜
 * 대기실입장            100
 * 방만들기               200
 * 방들어가기            210
 * 대화방에서 대화하기 400
 * 대화명 변경           420
 * 귓속말                 450
 * 방퇴장                 290
 * 종료                    900
 */
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;//Vector

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainClient extends JFrame implements ActionListener,Runnable,MouseListener{
	//변수
	Socket s;
	BufferedReader in;
	OutputStream out;//byte stream
	
	String name;//대화명
	String ip;
	String title="대기실";
	
	Object[][] data1=new String[0][2];//행열
	String []cols1={"방제목","인원"};
	DefaultTableModel model1=new DefaultTableModel(data1,cols1){
		//셀 편집못하게 하기
		public boolean isCellEditable(int rows,int cols){
			return false;
		}
	};//DefaultTableModel을 넣어야 테이블을 융통성있게 사용할 수 있음(ex)addRow()사용가능)
	JTable table1=new JTable(model1);
	JScrollPane scrollPane1=new JScrollPane(table1);
	
	Object[][] data2=new String[0][1];//행열
	String[]cols2={"대화방"};
	DefaultTableModel model2=new DefaultTableModel(data2,cols2);
	//                                              데이터  제목
	JTable table2=new JTable(model2);
	JScrollPane scrollPane2=new JScrollPane(table2);
	
	Object[][]data3=new Object[0][2];//행열
	String []cols3={"대화명","위치"};
	DefaultTableModel model3=new DefaultTableModel(data3,cols3);
	JTable table3=new JTable(model3);
	JScrollPane scrollPane3=new JScrollPane(table3);
	
	JButton createB=new JButton("방만들기");
	JButton roominB=new JButton("방들어가기");
	JButton exitB=new JButton("종 료");
	
	RoomClient roomclient=new RoomClient();//대화방
	
	//생성자
	public MainClient(String ip){
		setTitle("MainClient");
		this.ip=ip;
		
		table1.getTableHeader().setReorderingAllowed(false);//열순서 변경 못하게 한다
		table2.getTableHeader().setReorderingAllowed(false);
		table3.getTableHeader().setReorderingAllowed(false);
		
		table1.getTableHeader().setBackground(new Color(204,153,153));
		table2.getTableHeader().setBackground(new Color(204,204,255));
		table3.getTableHeader().setBackground(new Color(204,204,255));
		
		createB.setBackground(new Color(153,153,255));
		roominB.setBackground(new Color(153,153,255));
		exitB.setBackground(new Color(153,153,255));
		
		setLayout(null);//************
		
		scrollPane1.setBounds(10,10,400,250);
		getContentPane().add(scrollPane1);
		//getContentPane().add(scrollPane1).setBounds(10,10,400,250); 한줄로 쓰는 것도 가능함 
		
		scrollPane2.setBounds(415,10,168,250);
		getContentPane().add(scrollPane2);
		
		scrollPane3.setBounds(10,270,400,197);
		getContentPane().add(scrollPane3);
		
		createB.setBounds(449,300,100,30);
		getContentPane().add(createB);
		
		roominB.setBounds(449,340,100,30);
		getContentPane().add(roominB);
		
		exitB.setBounds(449,380,100,30);
		getContentPane().add(exitB);
		
		name=JOptionPane.showInputDialog(null,"대화명을 입력 하세요","");
		//                               소속안시킴  메시지                      내용
		
		name=name.trim();//공백제거
		if(name==null || name.length()<1){
			JOptionPane.showMessageDialog(null,"대화명을 입력 하세요");
			return;
		}//if 
		setSize(600,500);
		setVisible(true);
		
		eventUp();//사용자정의 메서드 호출
		connectProcess();//사용자 정의 메서드 호출,서버 접속
	}//cons end
	
	//사용자정의 메서드
	public void eventUp(){
		createB.addActionListener(this);
		roominB.addActionListener(this);
		exitB.addActionListener(this);
		
		table1.addMouseListener(this);
		
		
		//RoomClient 이벤트 등록
		roomclient.tf.addActionListener(this);
		roomclient.nickB.addActionListener(this);
		roomclient.sayB.addActionListener(this);
		roomclient.outB.addActionListener(this);
		
		
	}//eventUp() end
	
	
	////사용자정의 메서드:서버접속
	public void connectProcess(){
		try{
		s=new Socket(ip,7777);// 서버 접속은 ip,port 인수로 받는다 	
		in=new BufferedReader(new InputStreamReader(s.getInputStream()));
		out=s.getOutputStream();
		
		out.write((name+"\r\n").getBytes());// readUTF(),writeUTF()
		//                        인코딩작업: 한글이 깨지지 않도록
		new Thread(this).start();//run()호출
		}catch(Exception ex){
			System.out.println("서버 연결 실패:"+ex);
		}//catch end
	}//connectProcess() end
	
	//사용자정의 메서드:
	public void closeProcess(){
		try{
			roomclient.setVisible(false);//대화창을 안보이게 한다
			roomclient.dispose();//리소스반환
			out.write(("900|\r\n").getBytes());
			
			s.close();
			in.close();
			out.close();
			
		}catch(Exception ex){}
	}
	//오버라이딩
	public void mousePressed(MouseEvent e){
		model2.setRowCount(0);//테이블내용 모두 지우기
		
		int r=table1.getSelectedRow();//선택한 행을 얻는다
		String temp=(String)model1.getValueAt(r,0);//방제목을 얻는다
		
		for(int i=0;i<model3.getRowCount();i++){
			String roomt=(String)model3.getValueAt(i, 1);
			if(temp.equals(roomt)){//방제목이 같으면
				Object ob[]={model3.getValueAt(i, 0)};
				model2.addRow(ob);
			}//if end
		}//for end
		
	}//mousePressed()
	
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	
	//서버로 요청을 하는 부분
	public void actionPerformed(ActionEvent e){
		Object ob=e.getSource();
		
		if(ob==createB){//방만들기
			title=JOptionPane.showInputDialog(this,"방제목을 입력하시오");

			if(title==null || title.length()<1){
				JOptionPane.showMessageDialog(this,"방제목 입력하라고~~~");
				return;
			}//if

			try{
				out.write(("200|"+title+"\r\n").getBytes());//서버로 요청
			}catch(Exception ex){}

		}//if
			
		if(ob==roominB){//방 들어가기
			int row=table1.getSelectedRow();//선택한 행을 얻는다
			if(row<0){//0행0열
				JOptionPane.showMessageDialog(this,"방을 먼저 선택하세요");
				return;
			}//if

			title=(model1.getValueAt(row,0)).toString();//방제목얻기

			try{
				out.write(("210|"+title+"\r\n").getBytes());//서버로 보낸다
			}catch(Exception ex){}
		}//if
			
		if(ob==roomclient.tf){//대화하기
			String msg=roomclient.tf.getText().trim();
			roomclient.tf.setText("");
			if(msg.length()<1){//대화 내용이 없으면
				return;
			}//if

			try{
				out.write(("400|"+msg+"\r\n").getBytes());//메시지를 서버로 보낸다
				roomclient.tf.setText("");
			}catch(Exception ex){}
		}//if
		
		if(ob==roomclient.outB){//대화방에서 나가기
			try{
				out.write(("290|\r\n").getBytes());//서버로 보낸다
			}catch(Exception ex){}
			title="대기실";
		}//if end
		
		//대화명변경
		if(ob==roomclient.nickB){
			String newName=JOptionPane.showInputDialog(roomclient,"변경할 대화명을 입력하시오","");
			newName=newName.trim();
			if(newName==null||newName.length()<1){
				JOptionPane.showMessageDialog(null, "새로운 대화명을 입력하시오");
				return;
			}//if
			
			//이미 사용중인 대화명일때
			for(int i=0; i<roomclient.model1.getRowCount();i++){
				String nname=(String)roomclient.model1.getValueAt(i, 0);//대화명을 꺼내어
				if(newName.equals(nname)){//대화명비교를 하여 일치하는 것이 있으면
					JOptionPane.showMessageDialog(null, "사용중인 대화명입니다");
					return;
				}//if
			}//for
			
			try{
				out.write(("420|"+newName+"\r\n").getBytes());//서버로 보낸다
			}catch(Exception ex){}
			
		}//if
		
		//귓속말
		if(ob==roomclient.sayB){
			int row=roomclient.table1.getSelectedRow();//귓속말 보낼 상대방을 선택
			
			if(row<0){
				JOptionPane.showMessageDialog(null, "귓속말보낼 상대방을 선택 하시오");
				return;
			}//if
			String sayName=(roomclient.model1.getValueAt(row,0).toString());//대화창에서 대화명얻기
			String say=JOptionPane.showInputDialog(roomclient,"귓속말을 입력하시오");
			
			if(say==null ||say.length()<1){
				return;
			}//if
			try{
				out.write(("450|"+sayName+"|"+say+"\r\n").getBytes());//서버로 보내다  
				
				//자신의 대화창에도 출력
				roomclient.ta.append("[귀속말(to)]"+sayName+">>"+say+"\n");
			}catch(Exception ex){}
		}//if
		
		//종료
		if(ob==exitB){
			closeProcess();//메서드 호출
			System.exit(0);
		}//if
	}//actionPerformed()
	//서버가 보내진 내용을 출력하는 클라이언트 화면에 반영
	int protocol=0;//변수
	public void run(){
		while(true){
			try{
				String msg=in.readLine();//서버가 보내준 내용을 받는다
				if(msg==null){return;}
				//msg="100|대화명|방위치"
				StringTokenizer token=new StringTokenizer(msg,"|");
				protocol=Integer.parseInt(token.nextToken());
				
				switch(protocol){
				case 100:{//대기실입장
					String ob[]={token.nextToken(),token.nextToken()};
					model3.addRow(ob);
					break;
				}//100
				case 200:{//방만들기 
					String ob[]={token.nextToken(),token.nextToken()};
					//                  방제목                 인원
					model1.addRow(ob);
					break;
				}//200
				case 210:{//방들어가기
					String n=token.nextToken();//대화명 받고 
					String t=token.nextToken();//방제목 받고 
					
					//model3 대기실을 방제목으로 변경
					for(int i=0;i<model3.getRowCount();i++){
						String temp=(String)model3.getValueAt(i, 0);//대화명
						if(temp.equals(n)){//대화명이 일치하면
							model3.setValueAt(t, i, 1);//방제목으로 변경
							break;//for 탈출
						}//if
					}//for end
					
					//model1에 인원수 증가
					for(int i=0;i<model1.getRowCount();i++){
						String temp=(String)model1.getValueAt(i, 0);//방제목
						if(temp.equals(t)){//방이름이 일치하면
							int inwon=Integer.parseInt(model1.getValueAt(i,1)+"");
							model1.setValueAt(++inwon, i, 1);//인원 정리
							break;
						}//if
					}//for
					
					if(n.equals(name)){//n은 서버가 보내준 대화명
						//내가 방에 들어갈 때 호출
						roomInProcess();//메서드 호출
					}else if(t.equals(title)){
						//다른 사람이 대화방에 들어올 때  
						Object ob[]={n};
						roomclient.model1.addRow(ob);//대화방에만 대화명을 추가
						roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//방 인원정리
						roomclient.ta.append("***["+n+"] 님이 입장하였습니다***\n");
					}
					break;
				}//210
				case 400:{//대화방에서 대화하기
					roomclient.ta.append("\n"+token.nextToken()+" ");
					
					break;
				}//400
				case 290:{//방퇴장
					String n=token.nextToken();//대화명
					String t=token.nextToken();//방제목
					
					//model1 인원정리
					for(int i=0;i<model1.getRowCount();i++){
						String temp=(String)model1.getValueAt(i, 0);//방제목얻기
						
						if(t.equals(temp)){//방제목이 일치하면
							int inwon=Integer.parseInt(model1.getValueAt(i,1)+"");//인원을 꺼내서
							if(inwon==1){
								model1.removeRow(i);//1명이 있다가 나갔을때, 행삭제
							}else{
								model1.setValueAt(--inwon,i,1);//인원 감소
							}//else end
							break; //for 탈출
						}//if
					}//for end:인원정리
					
					//model3의 대화방이름을 대기실로 변경
					for(int i=0;i<model3.getRowCount();i++){
						String temp=(String)model3.getValueAt(i, 0);//대화명을 꺼내어
						if(n.equals(temp)){//대화명이 일치하면
							model3.setValueAt("대기실", i, 1);
							break;//for 탈출
						}//if
					}//for end 
					
					//대화방에서 내가 나갈때
					if(n.equals(name)){//대화명이 일치하면
						roomOutProcess();//메서드 호출
					}//if
					
					//대화방에서 다른사람이 나갈때
					if(t.equals(title)){
						//대화방에서 지금 나간 사람 정리
						for(int i=0;i<roomclient.model1.getRowCount();i++){
							String temp=(String)roomclient.model1.getValueAt(i,0);//대화명을 꺼내어 
							if(n.equals(temp)){//대화명이 일치하면 제거
								roomclient.model1.removeRow(i);//나간 사람제거
								break;//for 탈출
							}//if
						}//for
						roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//인원수 정리
						roomclient.ta.append("***["+n+"]이 퇴장하였습니다***\n");
					}//if
					
					break;
				}//290
				case 420:{// 대화명 변경
					String oldN=token.nextToken();//서버가 보내준 이전대화명
					String newN=token.nextToken();//서버가 보내준 새로운 대화명
					String t=token.nextToken();//서버가 보내준 방제목
					
					//model3에 대화명을 새이름으로 변경작업
					for(int i=0;i<model3.getRowCount();i++){
						String nn=(String)model3.getValueAt(i, 0);//대화명을 꺼내어 
						if(oldN.equals(nn)){//대화명이 일치하면 새로운 대화명으로 변경
							model3.setValueAt(newN,i,0);
							break;//for 탈출
						}//if
					}//for 
					
					//대화방의 대화명도 변경
					if(t.equals(title)){
						for(int i=0;i<roomclient.model1.getRowCount();i++){
							String nn=(String)roomclient.model1.getValueAt(i,0);//대화명을 꺼내어
							if(oldN.equals(nn)){//대화명이 일치하면,대화명 변경
								roomclient.model1.getValueAt(i,0);//대화명을 꺼내어 
								break;//for 탈출
							}//if
						}//for
						roomclient.ta.append("***["+oldN+"]님의 대화명이 ["+newN+"] 로 바뀌었습니다***\n");
					}//if
					
					if(oldN.equals(name)){
						name=newN;
					}//if
					
					break;
				}//420
				case 450:{//귓속말
					String n=token.nextToken();//대화명
					String str=token.nextToken();//귓속말
					roomclient.ta.append("[귓속말(from)]"+n+">>"+str+"\n");
					
					break;
					
				}//450
				case 900:{//종료
				  String n=token.nextToken();//대화명
				  String t=token.nextToken();//방제목,대기실
					
				  //model3에서 제거
				  for(int i=0;i<model3.getRowCount();i++){
					  String temp=(String)model3.getValueAt(i, 0);//대화명을 꺼내어 
					  if(temp.equals(n)){//대화명이 일치하면 제거
						  model3.removeRow(i);
						  break;//for 탈출
					  }//if
				  }//for
				  
				  //대화중 나갔을 때 model1에서 인원수정리
				  if(!t.equals("대기실")){
					  for(int i=0;i<model1.getRowCount();i++){
						  String temp=(String)model1.getValueAt(i, 0);//방제목얻어서
						  if(temp.equals(t)){//방 제목이 일치하면
							  int a=Integer.parseInt(model1.getValueAt(i, 1).toString());//인원수를 꺼내고
							  if(--a==0){//혼자 있다가 나갔을때
								  model1.removeRow(i);//행삭제
							  }else{
								  model1.setValueAt(a+"", i, 1);//인원갱신
							  }//else
							  break;//for 탈출
						  }//if
					  }//for end
				  }//if 대기실
				  
				  //대화방에서 다른 사람이 나간 경우
				  if(t.equals(title)){
					  for(int i=0;i<roomclient.model1.getRowCount();i++){
						  String temp=(String)roomclient.model1.getValueAt(i,0);//대화명을 꺼내고
						  
						  if(temp.equals(n)){//대화명을 찾아서
							  roomclient.model1.removeRow(i);//나간 사람제거
							  break;//for 탈출
						  }//if
					  }//for end
					  roomclient.inwon.setText(roomclient.model1.getRowCount()+"");//인원정리
					  roomclient.ta.append("***["+n+"]님이 퇴장 하였습니다");
				  }//if
					break;
				}//900
				
				}//switch end
				
			}catch(Exception ex){
				System.out.println("run()에서 서버와 연결 실패"+ex);
				return;
			}//catch end
		}//while end
	}//run() end
	
	//사용자정의 메서드:
	//내가 방에 들어갈때
	public void roomInProcess(){
		roomclient.setVisible(true);
		roomclient.tf.requestFocus();
		
		roomclient.ta.append("***["+title+"] 방에 입장하였습니다\n");
		for(int i=0;i<model3.getRowCount();i++){
			String temp=(String)model3.getValueAt(i,1);//방위치를 얻는다
			if(temp.equals(title)){//같은 방이면
				Object ob[]={model3.getValueAt(i,0)};//대화명을 꺼내서 
				roomclient.model1.addRow(ob);//대화창에 대화명 뿌리기
			}//if end
		}//for end
		roomclient.inwon.setText(roomclient.model1.getRowCount()+"");
		roominB.setEnabled(false);//방들어가기 비활성화
		createB.setEnabled(false);//방만들기 비활성화
	}//roomInProcess() end
	
	//사용자정의 메서드
	//내가 대화방에서 나갈 때 
	public void roomOutProcess(){
		roomclient.ta.setText("");//대화내용 제거
		roomclient.inwon.setText("");//인원내용 제거
		//테이블내용을 모두 지운다
		//for(int i=0;i<roomclient.model1.getRowCount();i++){
			//roomclient.model1.removeRow(0);
		//}//for end
		
		roomclient.model1.setRowCount(0);//테이블내용을 모두 지운다
		int a=roomclient.model1.getRowCount();
		roomclient.inwon.setText(a+"");
		roomclient.setVisible(false);//대화창은 안보이게 한다
		
		createB.setEnabled(true);//활성화
		roominB.setEnabled(true);//활성화
	}//roomOutProcess() end
	public static void main(String args[]){
		new MainClient(args[0]);
	}
}//class end




