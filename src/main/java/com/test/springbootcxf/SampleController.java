package com.test.springbootcxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-09 下午4:23
 */
@Controller
public class SampleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/rest/")
    @ResponseBody
    String home(String name) {
        LOGGER.info("call rest interface.");
        return "Hello World!" + name;
    }
}
