package day0616.mapreduce;

import redis.clients.jedis.Jedis;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Redis4IpOps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Jedis jedis = JedisUtil.getJedis();

		Map<String, String> ipMap = new HashMap<String, String>();

		BufferedReader br = new BufferedReader(new FileReader("F:\\Desktop\\ip.data"));

		String line = null;

		while ((line = br.readLine()) != null) {

			String[] fields = line.split("\t");

			ipMap.put(fields[0], fields[1] + "\t" + fields[2]);

		}

		jedis.hmset("ip_info", ipMap);

		JedisUtil.returnJedis(jedis);
	}

}
