package day0506.test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 
 * @author jiyudong
 *
 */
public class Demo01 {
	public static void main(String[] args) throws IOException {
		//创建文件
		File file = new File("F:\\Document");
		//File file = new File("F:");
		//创建RAF对象
		RandomAccessFile rfile = new RandomAccessFile("F:\\Record.txt", "rw");
		//调用获取函数
		duQuTxt(file, rfile);
		//关闭RAF流
		rfile.close();
		System.out.println("===========");
	}

	public static void duQuTxt(File file, RandomAccessFile rfile) throws IOException {
	
		//判断是否为文件
		if (file.isFile()) {
			//获取文件名
			String name = file.getName();
			//判断是否以.TXT为后缀
			if (name.endsWith(".txt")) {
				//写入文件名
				rfile.write(name.getBytes());
				//换行便于查看
				rfile.write("\r\n".getBytes());
			}
		}else {
			//file是目录
			File[] listFiles = file.listFiles();
			//判断是否为非空目录
			if (listFiles != null) {
			for (File file2 : listFiles) {
				duQuTxt(file2,rfile);
			}
		  }
		}
	}
}
