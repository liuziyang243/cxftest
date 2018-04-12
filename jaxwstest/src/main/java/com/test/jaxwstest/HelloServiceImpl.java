package com.test.jaxwstest;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 上午11:08
 */
@WebService(serviceName = "HelloService",
        endpointInterface = "com.test.jaxwstest.HelloService")
public class HelloServiceImpl implements HelloService {
    @Resource
    private WebServiceContext context;
    
    @Override
    public String greeting(String name) {
        return "hello " + name;
    }

    @Override
    public String sayHello() {
        return "hello world";
    }
}
