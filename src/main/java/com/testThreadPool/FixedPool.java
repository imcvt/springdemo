package com.testThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author luoly
 * @date 2018/9/19 13:55
 * @description
 */
public class FixedPool {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().maxMemory());
        test1();
    }

    /**
     * 创建一个指定线程数量从无界队列共享任务的线程池，在任何时候，至多{nThreads}线程将是活动的处理任务。如果在
     * 所有线程都处于活动状态时提交额外的任务，则它们将在队列中等待，直到线程可用。如果任何线程在关闭之前由于执行过
     * 程中的失败而终止，那么如果需要执行后续任务，将替换一个新的线程。池中的线程将存在，直到显式调用shutdown关闭为
     * 止
     */
    static void test1() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(() -> {
                try {
                    System.out.println(index);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
