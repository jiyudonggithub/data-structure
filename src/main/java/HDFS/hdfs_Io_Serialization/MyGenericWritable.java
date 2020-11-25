package HDFS.hdfs_Io_Serialization;

import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.GenericWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

public class MyGenericWritable extends GenericWritable {
	private static Class[] ClASSES = {Text.class,BytesWritable.class,IntWritable.class};
	@Override
	protected Class<? extends Writable>[] getTypes() {
		// TODO Auto-generated method stub
		return ClASSES;
	}

}
