package test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * 执行的任务
 */
public class MyJob implements Job {

	//执行的操作
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("我的自动任务：哈哈！！！"+new Date());
	}

}
