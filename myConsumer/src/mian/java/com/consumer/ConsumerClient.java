package com.consumer;

import com.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 刘志勇 on 2017-03-15.
 */
public class ConsumerClient {

    private static Logger logger = LoggerFactory.getLogger(ConsumerClient.class);

    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        HelloWorldService service = (HelloWorldService) applicationContext.getBean("helloService");

        String speakHello = service.speakHello("liu zhiyong");

        logger.info("speakHello{ }",speakHello);
    }
}
