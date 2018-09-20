package com.testThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author luoly
 * @date 2018/9/19 15:26
 * @description
 */
public class SinglePool {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 创建一个线程池(执行器)，它使用一个从无界队列中操作的单个工作线程。（但是，需要注意的是，如果该单个线程在关闭
     * 之前由于执行过程中的失败而终止，那么如果需要执行后续任务，将替换一个新的线程。）任务被保证顺序执行，并且在任何给
     * 定时间都不会有多于一个任务是活动的。与其他等价的{@code newFixedThreadPool(1)}不同，返回的执行器保证不会重新配置来
     * 使用其他线程
     */
    static void test1() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int index = i;

            singleThreadExecutor.execute(() -> {
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
