package com.test.springbootcxf;

import com.test.springbootcxf.soap.AggriateServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午2:46
 */
@Configuration
public class SoapServiceConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private AggriateServiceImpl aggriateService;

    @Autowired
    private Environment env;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, aggriateService);
        String soapUrl = env.getProperty("soap.url");
        // 服务发布地址是 http://{server.address}:{server.port}/{cxf.path} {soapUrl}
        endpoint.publish(soapUrl);
        return endpoint;
    }
}
