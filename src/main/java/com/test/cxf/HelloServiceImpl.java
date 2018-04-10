package com.test.cxf;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 上午11:08
 */
@WebService(endpointInterface = "com.test.cxf.HelloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String greeting(String name) {
        return "hello " + name;
    }

    @Override
    public String sayHello() {
        return "hello world";
    }
}
