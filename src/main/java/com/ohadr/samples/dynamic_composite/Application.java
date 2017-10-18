package com.ohadr.samples.dynamic_composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application
{

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
		SpringApplication.run(Application.class, args);
	}
}
