package test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * ִ�е�����
 */
public class MyJob implements Job {

	//ִ�еĲ���
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("�ҵ��Զ����񣺹���������"+new Date());
	}

}
