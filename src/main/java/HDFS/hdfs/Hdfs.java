package HDFS.hdfs;

import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class Hdfs {
	public static void main(String[] args) throws Exception {
		readFileToHdfs("/data/sex.txt");
//		putFileToHdfs();
	}

	public static void readFileToHdfs(String path) throws Exception {
		Configuration conf = new Configuration();
		FileSystem fSystem = FileSystem.get(new URI("HDFS.hdfs://192.168.19.130:9000"),conf);
		FSDataInputStream open = fSystem.open(new Path(path));
		IOUtils.copyBytes(open, System.out, 4096, true);
		fSystem.close();
		open.close();

	}
	public static void putFileToHdfs() throws Exception {
		Configuration conf = new Configuration();
		FileSystem fSystem = FileSystem.get(new URI("HDFS.hdfs://192.168.19.130:9000"), conf);
		fSystem.copyFromLocalFile(new Path("E:\\作业\\123.txt"), new Path("/123"));
		fSystem.close();
		System.out.println("执行结束");
	}
}
