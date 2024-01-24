package com.capg.Di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
    	Student student=(Student)applicationContext.getBean("stu1");
    	System.out.println(student);
    }
}
