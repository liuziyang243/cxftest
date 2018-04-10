package com.test.springbootcxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午2:41
 */
@WebService(endpointInterface = "com.test.springbootcxf.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldImpl.class);

    @Override
    public String sayHello(String name) {
        LOGGER.info("method sayHello called...");
        return "hello " + name;
    }

    @Override
    public String echo(String msg) {
        return msg;
    }
}
