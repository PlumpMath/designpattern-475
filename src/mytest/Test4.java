package mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*20. *（字节流，BufferedReader）完成下面操作。
在当前目录下创建一个worldcup.txt 的文本文件，其格式如下：
2006/意大利
2002/巴西
…
该文件采用“年份/世界杯冠军”的方式保存每一年世界杯冠军的信息。
要求：读入该文件的基础上，让用户输入一个年份，输出该年的世界杯冠军。如果该年
没有举办世界杯，则输出“没有举办世界杯”*/
public class Test4 {

	public static void main(String[] args) {
		BufferedReader r = null;
		String str = "";
		Map<String, String> map = new HashMap<String,String>();
		
		try{
			r = new BufferedReader(new InputStreamReader(new FileInputStream("worldcup.txt")));
			while((str = r.readLine()) != null){
				map.put(str.split("/")[0], str.split("/")[1]);
			}
			
			Scanner sc=new Scanner(System.in);  
			while(true){
				System.out.println("please the year:");  
				String n=sc.next();  
				
				if(map.keySet().contains(n)){
					System.out.println(map.get(n));
				}else{
					System.out.println("not this year");
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
	
}
