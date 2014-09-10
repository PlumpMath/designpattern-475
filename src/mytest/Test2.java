package mytest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

/*10. （Data 流）利用Data 流，完成下面操作：
1） 判断当前目录下是否存在一个“test.dat”的文件，如果该文件不存在，则往该文件
中写入一个long 类型的数值：10000L
2） 如果该文件存在，则从该文件中读出数值，并把该数值加1 之后，再存回文件中。*/
public class Test2 {
	
	
	public static void main(String[] args) {
		File f = new File("test.dat");
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try{
			if(f.exists()){
				in = new DataInputStream(new FileInputStream(f));
				long longValue = in.readLong();
				System.out.println("get long value from test.dat is " + longValue);
				longValue += 1l;
				
				out = new DataOutputStream(new FileOutputStream(f));
				out.writeLong(longValue);
			}else{
				if(f.createNewFile()){
					out = new DataOutputStream(new FileOutputStream(f));
					out.writeLong(10000l);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(out != null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
