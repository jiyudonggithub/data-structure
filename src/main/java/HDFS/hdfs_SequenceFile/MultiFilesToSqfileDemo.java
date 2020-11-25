package HDFS.hdfs_SequenceFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.SequenceFile.CompressionType;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.GzipCodec;

public class MultiFilesToSqfileDemo {
	public static void main(String[] args) throws Exception {

		// 得到输出流

		Configuration conf = new Configuration();

		String seqFS = "HDFS.hdfs://192.168.19.130:9000/output/block_deflate_sqFile";

		FileSystem fs = FileSystem.get(URI.create(seqFS), conf);

		Path seqPath = new Path(seqFS);

		SequenceFile.Writer writer = null;

		writer = SequenceFile.createWriter(fs, conf, seqPath, NullWritable.class, Text.class, CompressionType.BLOCK,

				new GzipCodec());

		Text value = new Text();

		// 得到输入流

		String filePath = "/root/data/input/";

		File gzPath = new File(filePath);

		String[] gzFiles = gzPath.list();

		int fileLen = gzFiles.length;

		// 循环的读取

		while (fileLen > 0) {

			File file = new File(filePath + gzFiles[fileLen - 1]);

			InputStream in = new BufferedInputStream(new FileInputStream(file));

			long len = file.length();

			byte[] buffer = new byte[(int) len];

			if ((len = in.read(buffer)) != -1) {

				value.set(buffer);

				writer.append(NullWritable.get(), value);

			}

			// 资源的回收

			value.clear();

			in.close();

			fileLen--;

		}

	}

}
