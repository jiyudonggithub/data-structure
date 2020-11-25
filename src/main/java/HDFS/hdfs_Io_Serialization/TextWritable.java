package HDFS.hdfs_Io_Serialization;

import org.apache.hadoop.io.Text;

public class TextWritable {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Text text = new Text("hello world");// 定义Text类型

		String str = new String("hello world");

		System.out.println("text.getLength():" + text.getLength());// 定义Text类型长度
																	// ——11

		System.out.println("string.length():" + str.length());

		System.out.println("text.find(\"lo\")" + text.find("lo"));// 获取lo对应的位置——3

		System.out.println("string.indexOf(\"lo\")" + str.indexOf("lo"));

		System.out.println("text.find(\"world\")" + text.find("world"));// 获取world对应的位置——6

		System.out.println("string.indexOf(\"world\")" + str.indexOf("world"));

		System.out.println("text.charAt(0)" + text.charAt(0));// 获取第0个字符量——104

		System.out.println("text.charAt(0)" + text.charAt(0));// 获取第0个字符量——104

		System.out.println("string.charAt(0)" + str.charAt(0));

		System.out.println("string.codePointAt(0)" + str.codePointAt(0));

		Text text1 = new Text();// 创建一个Text类型实例

		text1.set("had");// 进行赋值

		text1.append("oop".getBytes(), 0, "oop".getBytes().length);// 在后追加数据

		System.out.println(text1);// 输出结果

	}

}
