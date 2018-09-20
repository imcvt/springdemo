package com.testThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author luoly
 * @date 2018/9/19 10:05
 * @description
 */
public class CachedPool {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    /**
     * 创建一个线程池，根据需要创建新线程，但将在可用时重用先前构建的线程。这些池通常将提高执行许多短期
     * 异步任务的程序的性能。如果可用，对execute方法的调用将重用先前构造的线程。如果没有现有线程可用，则将
     * 创建新线程并将其添加到池中。未使用六十秒的线程被终止并从缓存中移除。因此，一个长期闲置的池不会消耗任
     * 何资源。可以使用ThreadPoolExecutor构造函数创建具有相似属性但不同细节（例如，超时参数）的线程池
     */
    static void test1() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for(int i=0; i<10; i++) {
            final int index = i;
            try{
                Thread.sleep(index * 1000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(() -> System.out.println(index));
        }
    }

    /**
     * 由于是缓存线程池，线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，
     * 而不用每次新建线程，如果任务比较耗时，第二个任务来的时候第一个还没执行完，会新建线程。
     * 特别注意的是，如果使用newCachedThreadPool线程池，突发访问量特别大，有可能导致内存溢出
     */
    static void test2() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for(int i=1; i<10000; i++) {
            final int index = i;
            cachedThreadPool.submit(() -> {
                try{
                    Thread.sleep(5000);
                    System.out.println(index);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
