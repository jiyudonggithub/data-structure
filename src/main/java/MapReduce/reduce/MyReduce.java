package MapReduce.reduce;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReduce extends Reducer<Text, Text, Text, Text>{
	
	@Override
	protected void reduce(Text key, Iterable<Text> value, Reducer<Text, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		for (Text text : value) {
			map.put(text.toString(),key.toString());
		}
		int uv = map.size();
		String string = String.valueOf(uv);
		context.write(key, new Text(string));
		map.clear();
	}

}
