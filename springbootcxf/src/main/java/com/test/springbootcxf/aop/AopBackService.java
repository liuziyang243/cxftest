package com.test.springbootcxf.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午1:17
 */
@Component
public class AopBackService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AopBackService.class);

    public void printMsg(String msg) {
        LOGGER.info("this is print by AopBackService:{}", msg);
    }
}
