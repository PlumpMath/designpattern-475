package mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/*9. （FileInputStream 和FileOutputStream）利用FileInputStream 和FileOutputStream，完成
下面的要求：
1） 用FileOutputStream 在当前目录下创建一个文件“test.txt”，并向文件输出“Hello
World”，如果文件已存在，则在原有文件内容后面追加。
2） 用FileInputStream 读入test.txt 文件，并在控制台上打印出test.txt 中的内容。
3） 要求用try-catch-finally 处理异常，并且关闭流应放在finally 块中。*/
public class Test1 {
	
	public static void main(String[] args) {
		
		String hello = "Hello World";
		System.out.println(System.getProperty("user.dir"));
		
		// 1） 用FileOutputStream 在当前目录下创建一个文件“test.txt”，并向文件输出“Hello
		File file = new File("test.txt");
		System.out.println(file.getAbsolutePath());
		InputStream in = null;
		OutputStream out = null;
		byte[] bytes = new byte[1024];
		int pos = 0;
		
		try{
			out = new FileOutputStream(file, file.exists());
			out.write(hello.getBytes());
			
			in = new FileInputStream(file);
			while((pos = in.read(bytes)) != -1){
				System.out.print(new String(bytes));
			}
			
		}catch (Exception e) {
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
