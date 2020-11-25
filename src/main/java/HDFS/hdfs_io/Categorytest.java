package HDFS.hdfs_io;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.Path;

import org.apache.hadoop.io.IntWritable;

import org.apache.hadoop.io.LongWritable;

import org.apache.hadoop.io.Text;

import org.apache.hadoop.io.compress.GzipCodec;

import org.apache.hadoop.mapreduce.Job;

import org.apache.hadoop.mapreduce.Mapper;

import org.apache.hadoop.mapreduce.Reducer;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class Categorytest {

	public static class Map extends Mapper<LongWritable, Text, Text, IntWritable> {

		private  static IntWritable one = new IntWritable();

		private Text text = new Text();

		public void map(LongWritable key, Text value, Context context)

				throws IOException, InterruptedException {

			String line = value.toString();

			String[] str = line.split("\t");

		    for (int i = 1; i < str.length; i++) {
		    	text.set(str[0]);
		    	one.set(Integer.parseInt(str[i]));
		    	context.write(text, one);
		    	
			}
			

		}

	}

	public static class Reduce extends Reducer<Text, IntWritable, Text, IntWritable> {

		public void reduce(Text key, Iterable<IntWritable> values,

				Context context) throws IOException, InterruptedException {

			int sum = 0;

			for (IntWritable d : values) {

				sum += d.get();

			}

			context.write(key, new IntWritable(sum));

		}

	}

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();

		conf.set("mapred.job.tracker", "192.168.19.130:9000");
		
		Job job = new Job(conf, "Categorytest");

		FileOutputFormat.setCompressOutput(job, true);

		FileOutputFormat.setOutputCompressorClass(job, GzipCodec.class);

		job.setJarByClass(Categorytest.class);

		job.setMapperClass(Map.class);

		job.setReducerClass(Reduce.class);

		job.setOutputKeyClass(Text.class);

		job.setOutputValueClass(IntWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));

		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}
