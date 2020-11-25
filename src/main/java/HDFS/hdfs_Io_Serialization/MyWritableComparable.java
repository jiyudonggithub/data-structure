package HDFS.hdfs_Io_Serialization;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class MyWritableComparable implements WritableComparable<MyWritableComparable> {
	private int counter;
	private long timestamp;

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		counter = in.readInt();
		timestamp = in.readLong();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeInt(counter);
		out.writeLong(timestamp);
	}

	@Override
	public int compareTo(MyWritableComparable o) {
		// TODO Auto-generated method stub
		int thisValue = this.counter;
		int thatValue = o.counter;
		return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
		return result;
	}

}
