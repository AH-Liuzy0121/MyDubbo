package com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by 刘志勇 on 2017-03-15.
 */
public class ProviderServer {

    private static Logger logger = LoggerFactory.getLogger(ProviderServer.class);

    public static void main(String[] args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");

        applicationContext.start();

        try {
            logger.info("按任意健退出!");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("异常{ }",e.getMessage());
        }

    }
}
