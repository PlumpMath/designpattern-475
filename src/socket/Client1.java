package socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1", 9876);
			//s.getOutputStream().w
			s.getInputStream();
			
			Scanner sc=new Scanner(System.in);  
			while(true){
				sc.reset();
				System.out.println("input:");  
				String n=sc.next();
				System.out.println(n);
				s.getOutputStream().write(n.getBytes("UTF-8"));
				s.getOutputStream().flush();
			}
				
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
