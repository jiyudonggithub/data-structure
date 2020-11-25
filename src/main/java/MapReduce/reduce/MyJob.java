package MapReduce.reduce;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;

import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;

import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;

import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
public class MyJob {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		 Path outputPath = new Path("F:\\Desktop\\result5");
		 
	        Configuration conf = new Configuration();

	        String jobName = MyJob.class.getSimpleName();

	        Job job = Job.getInstance(conf, jobName);

	        job.setJarByClass(MyJob.class);

	        FileInputFormat.addInputPath(job, new Path("F:\\Desktop\\input"));

	        job.setInputFormatClass(TextInputFormat.class);

	        job.setMapperClass(MyMap.class);
	        job.setReducerClass(MyReduce.class);

	        job.setMapOutputKeyClass(Text.class);

	        job.setMapOutputValueClass(Text.class);

	        // 设置mr的输出参数

	        outputPath.getFileSystem(conf).delete(outputPath, true);    // 避免job在运行的时候出现输出目录已经存在的异常

	        FileOutputFormat.setOutputPath(job, outputPath);

	        job.setOutputFormatClass(TextOutputFormat.class);

	 

	        job.setOutputKeyClass(Text.class);

	        job.setOutputValueClass(Text.class);

	        job.setNumReduceTasks(1);   // map only操作，没有reducer

	 

	        job.waitForCompletion(true);

	}

}
