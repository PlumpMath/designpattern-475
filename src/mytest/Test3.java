package mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/*15. *（字符流、桥转换）完成下面功能：
事先在当前目录下准备好一个test1.txt 的文本文件，要求该文本文件是使用GBK 编码的
多行文本文件。如：
test.txt
窗前明月光
疑是地上霜
举头望明月
低头思故乡
利用字节流+桥转换读入这个文本文件，然后按照行的顺序，以UTF-8 的编码方式，写
到test2.txt 文件中，例：
test2.txt
低头思故乡
举头望明月
疑是地上霜
窗前明月光*/
public class Test3 {

	public static void main(String[] args) {
		InputStreamReader ir = null;
		OutputStreamWriter ow = null;
		char[] chars = new char[1024];
		int c = 0;
		
		try{
			ir = new InputStreamReader(new FileInputStream("text1.txt"),"GBK");
			ow = new OutputStreamWriter(new FileOutputStream("text2.txt"), "UTF-8");
			while((c = ir.read(chars)) != -1){
				ow.write(chars);
			}
		}catch(Exception e){
			
		}finally{
			try {
				if(ir != null){
					ir.close();
				}
				if(ow != null){
					ow.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
