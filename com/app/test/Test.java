package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.model;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/cfg/config.xml");
			Object ob=ctx.getBean("prodObj");
				model m=(model)ob;
					System.out.println("\t"+m);
	}

}
