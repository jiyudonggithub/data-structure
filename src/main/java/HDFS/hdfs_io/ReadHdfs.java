package HDFS.hdfs_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
public class ReadHdfs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		readHdfsFile("/test/123.txt");
	}

	public static void readHdfsFile(String path) throws IOException, URISyntaxException, InterruptedException {
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(new URI("hdfs://192.168.19.131:9000"),conf);
		FSDataInputStream fi = fs.open(new Path(path));
		BufferedReader br = new BufferedReader(new InputStreamReader(fi));
		String read = "";
		while ((read = br.readLine()) != null) {
			System.out.println(read);
		}
		br.close();
		fi.close();
		fs.close();
	}

}
