package com.test.soapInterface;

import com.test.servicetest.AggregateService;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午12:52
 */
@WebService(serviceName = "HelloService",
        endpointInterface = "com.test.servicetest.AggregateService")
@HandlerChain(file = "handlersdef.xml")
public class AggregateServiceImpl implements AggregateService {
    @Resource
    private WebServiceContext context;

    private HelloService impl;

    public void setImpl(HelloService impl) {
        this.impl = impl;
    }

    @Override
    public String sayHello() {
        return impl.sayHello();
    }

    @Override
    public String greeting(String name) {
        return impl.greeting(name);
    }
}
