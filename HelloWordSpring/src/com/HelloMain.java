package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h=(HelloWorld)ctx.getBean("hello");
		System.out.println(h.sayHello());
	}

}
