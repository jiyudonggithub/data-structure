package MapReduce.mapreduce;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.log4j.Logger;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MyMapper extends Mapper<LongWritable, Text, NullWritable, Text> {
	private Logger logger;
	private DateFormat df;
	private Jedis jedis;
	private String[] fields;
	private String appid; // 数据来源 web:1000,android:1001,ios:1002,ipad:1003
	private String ip;
	// 通过ip来衍生出来的字段 province和city
	private String province;
	private String city;
	private String mid; // mid:唯一的id此id第一次会种在浏览器的cookie里。如果存在则不再种。作为浏览器唯一标示。移动端或者pad直接取机器码。
	private String userId; // 用户id

	@Override
	protected void setup(Mapper<LongWritable, Text, NullWritable, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		logger = Logger.getLogger(MyMapper.class);
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		jedis = JedisUtil.getJedis();
	}

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, NullWritable, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String str = value.toString();
		String[] split = str.split("\t");
		if (split.length < 9 || str == null) {
			return;
		} else {
			if (!split[1].equals("null") ) {
				if (split[2].equals("null")) {
					split[2] = "99a99b9c-9999-9bb9-b999-99d9a99c9b99";
				}
				String hget = jedis.hget("ip_info", split[1]);
				String[] split2 = hget.split("\t");
				province = split2[0];
				city = split2[1];
				mid = split[2];
				String maper = province + "\t" + mid;
				context.write(NullWritable.get(), new Text(maper));
			}
		}
	}

	@Override
	protected void cleanup(Mapper<LongWritable, Text, NullWritable, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		logger = null;
		df = null;
		JedisUtil.returnJedis(jedis);
	}
}
