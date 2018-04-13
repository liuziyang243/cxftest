package com.test.springbootcxf.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午4:23
 */
@RestController
@RequestMapping("/rest/services")
public class RestServiceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestServiceController.class);

    @RequestMapping("/home")
    String home(String name) {
        LOGGER.info("call rest interface.");
        return "Hello World!" + name;
    }
}
