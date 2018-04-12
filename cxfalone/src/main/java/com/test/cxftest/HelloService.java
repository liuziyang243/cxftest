package com.test.cxftest;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 上午11:07
 */
@WebService
public interface HelloService {

    public String sayHello();

    @WebResult(name = "makeGreeting", header = true)
    public String greeting(@WebParam(name="name") String name);
}
