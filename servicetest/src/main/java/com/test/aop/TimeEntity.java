package com.test.aop;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author lzy
 * @create 2018-04-13 下午12:39
 */
public class TimeEntity {
    private String className;
    private String methodName;
    private long handlingTime;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public long getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(long handlingTime) {
        this.handlingTime = handlingTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[Class:").append(className).append("],")
                .append("[Method:").append(methodName).append("],")
                .append("[Handle Time:").append(handlingTime).append("(ms)]");
        return builder.toString();
    }
}
