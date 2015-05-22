package com.soni.beanannotations.annotated;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PojoBean2Test {

    public static void main(String[] args) {
        testWithConfig(SpringConfig1.class);
    }

    private static void testWithConfig(final Class config) throws BeansException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(config);
        PojoBean2 pojo = (PojoBean2) ctx.getBean(PojoBean2.class);
        System.err.println("spring bean annotated test");
        System.err.println(pojo.getFirstName());
        System.err.println(pojo.getLastName());
    }
}
