package HDFS.hdfs_Io_Serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.VIntWritable;
import org.apache.hadoop.io.Writable;

public class IntWritableTest {
	public static void main(String[] args) throws IOException {

		// 定义两个比较小的IntWritable，序列化后1个字节的临界点，《Hadoop权威指南》中所说的是-127～127，但是，我发现只能是-112～127

		// 超过-112后，就成为2个字节了

		IntWritable writable = new IntWritable(112);

		VIntWritable vwritable = new VIntWritable(-112);

		show(writable, vwritable);

		// 验证不是从-127～127

		writable.set(-113);

		vwritable.set(-113);

		show(writable, vwritable);

		// 序列化后两个字节大小的范围 -256（2的8次方）~ -128 或者 128～255

		writable.set(-256);

		vwritable.set(-256);

		show(writable, vwritable);

		// 序列化后3个字节大小的范围 -65536（2的16次方）～ -257 或者 256～65535

		writable.set(-65536);

		vwritable.set(-65536);

		show(writable, vwritable);

		// 序列化后4个字节大小的范围 -16777216(2的24次方) ～ -65537 或者 65536 ～ 16777215

		writable.set(-16777216);

		vwritable.set(-16777216);

		show(writable, vwritable);

		// 序列化后4个字节大小的范围 -2147483648(2的31次方) ～ -16777217 或者 16777216 ～
		// 2147483647

		writable.set(-2147483648);

		vwritable.set(-2147483648);

		show(writable, vwritable);

	}

	public static byte[] serizlize(Writable writable) throws IOException {

		// 创建一个输出字节流对象

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		DataOutputStream dataout = new DataOutputStream(out);

		// 将结构化数据的对象writable写入到输出字节流。

		writable.write(dataout);

		return out.toByteArray();

	}

	public static byte[] deserizlize(Writable writable, byte[] bytes) throws IOException {

		// 创建一个输入字节流对象，将字节数组中的数据，写入到输入流中

		ByteArrayInputStream in = new ByteArrayInputStream(bytes);

		DataInputStream datain = new DataInputStream(in);

		// 将输入流中的字节流数据反序列化

		writable.readFields(datain);

		return bytes;

	}

	public static void show(Writable writable, Writable vwritable) throws IOException {

		// 对上面两个进行序列化

		byte[] writablebyte = serizlize(writable);

		byte[] vwritablebyte = serizlize(vwritable);

		// 分别输出字节大小

		System.out.println("定长格式" + writable + "序列化后字节长大小：" + writablebyte.length);

		System.out.println("变长格式" + vwritable + "序列化后字节长大小：" + vwritablebyte.length);

	}

}
