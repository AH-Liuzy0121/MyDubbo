package com.service.impl;

import com.service.HelloWorldService;

/**
 * Created by 刘志勇 on 2017-03-15.
 */
public class HelloWorldServiceImpl implements HelloWorldService {

    public String speakHello(String str) {

        return "Hello, " + str;
    }
}
