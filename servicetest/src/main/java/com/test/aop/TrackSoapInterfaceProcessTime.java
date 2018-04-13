package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午12:38
 */
@Aspect
public class TrackSoapInterfaceProcessTime {
    private static final Logger logger = LoggerFactory.getLogger(TrackSoapInterfaceProcessTime.class);
    private long startTime = 0;

    private AopBackService backService;

    public TrackSoapInterfaceProcessTime() {
    }

    public void setBackService(AopBackService backService) {
        this.backService = backService;
    }

    /**
     * 对所有子包中的类的所有public方法有效
     */
    @Pointcut("execution(public * com.test.soapInterface.HelloServiceImpl.*(..))")
    public void recordTime() {
    }

    @Before("recordTime()")
    public void before(JoinPoint jp) {
        //获取访问时的当前时间
        startTime = System.currentTimeMillis();
        backService.printMsg(String.valueOf(startTime));
    }

    @AfterReturning("recordTime()")
    public void afterReturning(JoinPoint jp) {
        //计算出调用方法返回的用时
        long process = System.currentTimeMillis() - startTime;
        //获取类名
        String className = jp.getThis().toString();
        // 获得方法名
        String methodName = jp.getSignature().getName();
        TimeEntity e = new TimeEntity();
        e.setClassName(className);
        e.setMethodName(methodName);
        e.setHandlingTime(process);
        logger.info("[Static] {}", e.toString());
    }
}
