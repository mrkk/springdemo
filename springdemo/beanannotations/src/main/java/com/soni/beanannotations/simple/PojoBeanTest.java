package com.soni.beanannotations.simple;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Kalpesh soni
 */
public class PojoBeanTest {
    public static void main(String[] args) {
//        testWithConfig("simplepojo/config1.xml");
        testWithConfig("simplepojo/config2.xml");
    }

    private static void testWithConfig(final String config) throws BeansException {
        ApplicationContext ctx = new  ClassPathXmlApplicationContext(config);
        PojoBean pojo = (PojoBean)ctx.getBean("pojo1");
        System.err.println("spring bean test");
        System.err.println(pojo.getFirstName());
        System.err.println(pojo.getLastName());
    }
}
