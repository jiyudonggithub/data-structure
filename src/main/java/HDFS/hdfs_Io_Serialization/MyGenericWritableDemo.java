package HDFS.hdfs_Io_Serialization;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.util.StringUtils;

public class MyGenericWritableDemo {
	public static void main(String[] args) throws IOException {

		Text t = new Text("Hadoop");

		byte[] byte0 = serialize(t);

		System.out.println("Text序列化后的长度：" + byte0.length);

		System.out.println("Text序列化的16进制表示：" + StringUtils.byteToHexString(byte0));

		MyGenericWritable genericText = new MyGenericWritable();

		genericText.set(t);

		byte[] byteText = serialize(genericText);

		System.out.println("TextGenericWritable序列化后的长度：" + byteText.length);

		System.out.println("TextGenericWritable列化的16进制表示：" + StringUtils.byteToHexString(byteText));

		BytesWritable bytes = new BytesWritable(new byte[] { 3, 5 });

		byte[] byte1 = serialize(bytes);

		// 前面的介绍，可以知道，长度为6

		System.out.println("bytes数组序列化后的长度：" + byte1.length);

		System.out.println("bytes数组序列化的16进制表示：" + StringUtils.byteToHexString(byte1));

		MyGenericWritable generic = new MyGenericWritable();

		generic.set(bytes);

		byte[] byteBytes = serialize(generic);

		System.out.println("GenericWritable序列化后的长度：" + byteBytes.length);

		System.out.println("GenericWritable列化的16进制表示：" + StringUtils.byteToHexString(byteBytes));

		IntWritable intWritable = new IntWritable(2);

		byte[] byte2 = serialize(intWritable);

		System.out.println("IntWritable序列化后的长度：" + byte2.length);

		System.out.println("IntWritable序列化的16进制表示：" + StringUtils.byteToHexString(byte2));

		MyGenericWritable genericInt = new MyGenericWritable();

		genericInt.set(intWritable);

		byte[] byteInt = serialize(genericInt);

		System.out.println("IntGenericWritable序列化后的长度：" + byteInt.length);

		System.out.println("IntGenericWritable列化的16进制表示：" + StringUtils.byteToHexString(byteInt));

	}

	public static byte[] serialize(Writable writable) throws IOException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		DataOutputStream dataOut = new DataOutputStream(out);

		writable.write(dataOut);

		return out.toByteArray();

	}
}
