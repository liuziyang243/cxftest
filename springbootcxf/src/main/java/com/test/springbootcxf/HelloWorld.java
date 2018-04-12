package com.test.springbootcxf;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午2:40
 */
@WebService
public interface HelloWorld {
    public String sayHello(@WebParam(name = "name") String name);

    public String echo(@WebParam(name = "msg") String msg);
}
