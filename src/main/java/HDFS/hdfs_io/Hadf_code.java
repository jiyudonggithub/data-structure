package HDFS.hdfs_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionInputStream;
import org.apache.hadoop.io.compress.DeflateCodec;
import org.apache.hadoop.util.ReflectionUtils;

public class Hadf_code {
	public static void main(String[] args) throws Exception {
		String inpath = "/user/student.xml";
		String outpath = "/user/student.deflate";
		Configuration conf = new Configuration();
		DeflateCodec codec = new DeflateCodec();
		ReflectionUtils.setConf(codec, conf);
		CompressionInputStream comIn = codec.createInputStream(new FileInputStream(inpath));
		IOUtils.copyBytes(comIn, new FileOutputStream(outpath), 1024);
		comIn.close();
	}
}
