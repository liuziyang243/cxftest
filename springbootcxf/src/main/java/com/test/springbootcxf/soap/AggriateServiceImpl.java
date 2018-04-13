package com.test.springbootcxf.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午5:24
 */
@WebService(endpointInterface = "com.test.springbootcxf.soap.AggriateService")
@HandlerChain(file = "classpath:handlersdef.xml")
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
@Component
public class AggriateServiceImpl implements AggriateService {
    @Resource
    private WebServiceContext context;

    @Autowired
    private HelloWorld helloWorld;

    @Override
    public String sayHello(String name) {
        return helloWorld.sayHello(name);
    }

    @Override
    public String echo(String msg) {
        return helloWorld.echo(msg);
    }
}
