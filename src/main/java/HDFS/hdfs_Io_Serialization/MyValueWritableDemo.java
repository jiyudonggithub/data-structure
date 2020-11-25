package HDFS.hdfs_Io_Serialization;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class MyValueWritableDemo implements WritableComparable {
	private String title;

	private long timestamp;

	private String content;

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public long getTimestamp() {

		return timestamp;

	}

	public void setTimestamp(long timestamp) {

		this.timestamp = timestamp;

	}

	public String getContent() {

		return content;

	}

	public void setContent(String content) {

		this.content = content;

	}

	@Override

	public String toString() {

		return title + "\t" + timestamp + "\t" + content;

	}

	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		title = in.readUTF();

		timestamp = in.readLong();

		content = in.readUTF();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(title);

		out.writeLong(timestamp);

		out.writeUTF(content);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
