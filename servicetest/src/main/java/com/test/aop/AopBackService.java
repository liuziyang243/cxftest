package com.test.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午1:17
 */
public class AopBackService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AopBackService.class);

    public void printMsg(String msg) {
        LOGGER.info("this is print by AopBackService:{}", msg);
    }
}
