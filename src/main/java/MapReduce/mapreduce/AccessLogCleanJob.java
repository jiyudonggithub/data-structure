package MapReduce.mapreduce;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
public class AccessLogCleanJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Path outputPath = new Path("F:\\Desktop\\result4");
	        Configuration conf = new Configuration();
	        String jobName = AccessLogCleanJob.class.getSimpleName();
	        Job job = null;
			try {
				job = Job.getInstance(conf, jobName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        job.setJarByClass(AccessLogCleanJob.class);
	        try {
				FileInputFormat.addInputPath(job, new Path("F:\\Desktop\\input"));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        job.setInputFormatClass(TextInputFormat.class);
	        job.setMapperClass(MyMapper.class);
	        job.setMapOutputKeyClass(NullWritable.class);
	        job.setMapOutputValueClass(Text.class);
	        // 设置mr的输出参数

//	        outputPath.getFileSystem(conf).delete(outputPath, true);    // 避免job在运行的时候出现输出目录已经存在的异常

	        FileOutputFormat.setOutputPath(job, outputPath);

	        job.setOutputFormatClass(TextOutputFormat.class);

	        job.setOutputKeyClass(NullWritable.class);
	        job.setOutputValueClass(Text.class);
	        job.setNumReduceTasks(0);   // map only操作，没有reducer
	        try {
				job.waitForCompletion(true);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
