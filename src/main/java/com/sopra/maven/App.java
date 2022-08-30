package com.sopra.maven;

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
       ApplicationContext cn=new ClassPathXmlApplicationContext("com/sopra/maven/config.xml");
   student s=(student)cn.getBean("stu");
   System.out.println(s);
    }
}
