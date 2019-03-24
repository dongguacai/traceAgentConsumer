package com.cd;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desctiption:
 * @author:chendong
 * @date:2018/9/2
 */
public class ConsumerTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        String hello = demoService.sayHello("world");
    }

}
