package com.test.cxftest;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 上午11:08
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setAddress("http://0.0.0.0:9008/ws/soap/hello");
        factory.setServiceClass(HelloService.class);
        factory.setServiceBean(new HelloServiceImpl());
        factory.create();
        LOGGER.info("service publish....");
    }
}
