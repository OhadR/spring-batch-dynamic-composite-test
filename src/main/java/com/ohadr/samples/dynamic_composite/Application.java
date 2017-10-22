package com.ohadr.samples.dynamic_composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application
{
    private static final Logger log = LoggerFactory.getLogger(Application.class);

	
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
		SpringApplication.run(Application.class, args);

		log.info("STARTING");
		// create the job according to job name
		Job job = (Job) context.getBean("OhadsTask");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

//		JobParametersBuilder builder = new JobParametersBuilder();
//		JobParameters jobParams = new JobParameters();

		
		JobParameters jobParameters =
				  new JobParametersBuilder()
				  .addLong("time",System.currentTimeMillis()).toJobParameters();

		// run the job
		JobExecution jobExecution = jobLauncher.run(job, jobParameters);

		
		log.info("END");
	}
}
