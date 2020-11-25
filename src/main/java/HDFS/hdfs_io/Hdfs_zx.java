package HDFS.hdfs_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CodecPool;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.io.compress.Compressor;
import org.apache.hadoop.util.ReflectionUtils;

public class Hdfs_zx {
	public static void main(String[] args) throws Exception {
		String codecClassname = "org.apache.hadoop.io.compress.DeflateCodec";
		Class codecClass = Class.forName(codecClassname);
		Configuration conf = new Configuration();
		CompressionCodec codec = (CompressionCodec) ReflectionUtils.newInstance(codecClass, conf);
		Compressor compressor = null;
		try {
			compressor = CodecPool.getCompressor(codec);
			FileOutputStream out = new FileOutputStream("/user/def_comments.deflate");
			CompressionOutputStream outs = codec.createOutputStream(out, compressor);
			IOUtils.copyBytes(new FileInputStream("/user/def_comments.xml"), outs, 4096, false);
			outs.finish();
		} finally {
			CodecPool.returnCompressor(compressor);
		}
	}

}
