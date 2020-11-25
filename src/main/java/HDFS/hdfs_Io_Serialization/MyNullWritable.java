package HDFS.hdfs_Io_Serialization;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Writable;

public class MyNullWritable {

	public static void main(String[] args) throws IOException {

		NullWritable writable = NullWritable.get();

		byte[] bytes = serialize(writable);

		System.out.println("NullWritable序列化后的长度：" + bytes.length);

	}

	public static byte[] serialize(Writable writable) throws IOException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		DataOutputStream dataOut = new DataOutputStream(out);

		writable.write(dataOut);

		return out.toByteArray();

	}

}
