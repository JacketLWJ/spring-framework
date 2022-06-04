package org.springframework.mywork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 罗文俊
 * 2022/3/17
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_context.xml");

		IOCService iocService=context.getBean(IOCService.class);
		System.out.println(iocService.hello());
	}
}
