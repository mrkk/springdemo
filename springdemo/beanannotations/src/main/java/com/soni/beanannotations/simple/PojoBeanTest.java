package com.soni.beanannotations.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Kalpesh soni
 */
public class PojoBeanTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new  ClassPathXmlApplicationContext("config1.xml");
        PojoBean pojo = (PojoBean)ctx.getBean("pojo1");
        System.err.println("spring bean test");
        System.err.println(pojo.getFirstName());
        System.err.println(pojo.getLastName());
    }
}
