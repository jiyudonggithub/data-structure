package HDFS.hdfs_io;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.compress.CompressionCodec;
import org.apache.hadoop.io.compress.CompressionCodecFactory;

public class Hdfs_GZ {
	public static void main(String[] args) throws Exception {
		String uri = "/user/student.gz";
		Configuration cof = new Configuration();
		FileSystem fs = FileSystem.get(URI.create(uri), cof);
		Path inputPath = new Path(uri);
		CompressionCodecFactory factory = new CompressionCodecFactory(cof);
		CompressionCodec codec = factory.getCodec(inputPath);
		if (codec == null) {
			System.out.println("No codec found for" + uri);
			System.exit(1);
		}
		String outputUri = CompressionCodecFactory.removeSuffix(uri, codec.getDefaultExtension());
		InputStream in = null;
		OutputStream out = null;
		try {
			in = codec.createInputStream(fs.open(inputPath));
			out = fs.create(new Path(outputUri));
			IOUtils.copyBytes(in, out, cof);
		} finally {
			IOUtils.closeStream(in);
			IOUtils.closeStream(out);
		}
		;
	}
}
