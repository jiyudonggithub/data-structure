package HDFS.hdfs_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.util.ReflectionUtils;

public class HDFS_Io {
	public static void main(String[] args) throws Exception {
		String inpath = "G:\\student.xml";
		String outpath = "";
		Configuration conf = new Configuration();
		String codecClassname = "org.apache.hadoop.io.compress.DeflateCodec";
		Class codecCalss = Class.forName(codecClassname);
		CompressionCodec codec = (CompressionCodec) ReflectionUtils.newInstance(codecCalss, conf);
		FileOutputStream fos = new FileOutputStream(outpath);
		CompressionOutputStream comout = codec.createOutputStream(fos);
		IOUtils.copyBytes(new FileInputStream(inpath), comout, 4096, false);
		comout.finish();
	}

}
