package MapReduce.reduce;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, Text, Text> {
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String userAgent;
		String[] split = value.toString().split("\t");
		if (!split[1].equals("null") && !split[8].equals("null")) {
			userAgent = split[8];
			if (!userAgent.equals("null")) {
				UserAgent uAgent = UserAgentUtil.getUserAgent(userAgent);
				if (uAgent != null) {
					String browser = uAgent.getBrowserType();
					if (browser != null) {
						context.write(new Text(browser), new Text(split[2]));
					}
				}
			}
		}
	}
}
