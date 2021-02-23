package com.liang.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");

		MyBean bean = classPathXmlApplicationContext.getBean(MyBean.class);

		System.out.println(bean);

	}
}
