package com.test.springbootcxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午3:00
 */
@SpringBootApplication
public class SampleWsApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleWsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SampleWsApplication.class, args);
        LOGGER.info("web service start...");
    }
}
