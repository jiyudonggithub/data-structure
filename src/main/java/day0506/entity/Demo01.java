package day0506.entity;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		// File file = new File("f:\\a\\b\\c");
		System.out.println(meth(10));
	
	}

	public static void medth(File file) {
		String path = file.getPath();
		int lastIndexOf = path.lastIndexOf("\\");
		path = path.substring(0, lastIndexOf);
		file.delete();
		file = new File(path);
	}

	public static int meth(int n) {
		if (n <= 0) {
			System.out.println("错误");
		}
		if (n == 2 || n == 1) {
			return 1;
		} else {
			return meth(n - 1) + meth(n - 2);
		}
	}
}
