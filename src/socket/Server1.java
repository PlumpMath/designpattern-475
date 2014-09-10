package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket s = null;
		
		try {
			ss = new ServerSocket(9876);
			System.err.println("server is up");
			byte[] bytes = new byte[1024];
			int len = 0;
			while(true){
				s  = ss.accept();
				
				while((len = s.getInputStream().read(bytes)) != -1){
					String str = new String(bytes,"UTF-8");
					System.out.println("receive:" + str);
					if("ends".equals(str)){
						break;
					}
					bytes = new byte[1024];
					//s.sendUrgentData(0xFF);
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			System.out.println("socket关闭：" + s.getRemoteSocketAddress().toString());
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
