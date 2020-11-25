package HDFS.hdfs_Io_Serialization;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.ObjectWritable;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.util.StringUtils;

public class MyObjectWritable {
	public static void main(String[] args) throws IOException {

		BytesWritable bytes = new BytesWritable(new byte[] { 3, 5 });

		byte[] byte1 = serialize(bytes);

		// 前面的介绍，可以知道，长度为6

		System.out.println("bytes数组序列化后的长度：" + byte1.length);

		System.out.println("bytes数组序列化的16进制表示：" + StringUtils.byteToHexString(byte1));

		ObjectWritable object = new ObjectWritable();

		object.set(new byte[] { 3, 5 });

		byte[] byte2 = serialize(object);

		System.out.println("ObjectWritable序列化后的长度：" + byte2.length);

		System.out.println("ObjectWritable列化的16进制表示：" + StringUtils.byteToHexString(byte2));

	}

	public static byte[] serialize(Writable writable) throws IOException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		DataOutputStream dataOut = new DataOutputStream(out);

		writable.write(dataOut);

		return out.toByteArray();

	}

}
