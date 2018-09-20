package com.testThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author luoly
 * @date 2018/9/19 14:50
 * @description
 */
public class SchedulePool {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 创建一个在给定延迟之后执行命令或者定时执行命令的调度线程池，{corePoolSize}是保留在线程池中的活跃线程数量，
     * 即使是空闲的也不会回收
     */
    static void test1() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        //延迟1秒执行，并且每3秒执行一次
        scheduledThreadPool.scheduleWithFixedDelay(() -> System.out.println("delay 3 seconds"),1,3, TimeUnit.SECONDS);


    }
}
