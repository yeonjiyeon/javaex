package ch22_network;
import java.net.*;
//www.google.com
//www.naver.com
//www.kakaocorp.com
public class InetAddressDemo {
	public static void main(String args[]){
		try{
			InetAddress addr[]=InetAddress.getAllByName(args[0]);
			for(int i=0;i<addr.length;i++){
				System.out.println("µµ¸ÞÀÎ:"+addr[i].getHostName());
				System.out.println("ip:"+addr[i].getHostAddress());
			}//for end
			
		}catch(Exception ex){
			System.out.println(ex);
		}
		
	}//main end
}//class end
