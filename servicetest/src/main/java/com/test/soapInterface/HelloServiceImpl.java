package com.test.soapInterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 上午11:08
 */
public class HelloServiceImpl implements HelloService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String greeting(String name) {
        LOGGER.info("call greeting method");
        return "hello " + name;
    }

    @Override
    public String sayHello() {
        LOGGER.info("call sayHello method");
        return "hello world";
    }
}
