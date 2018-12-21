package com.testsycrinized;

/**
 * @author luoly
 * @date 2018/10/8 14:10
 * @description
 */
public class TestSyncrinized {


    public static void main(String[] args) {

        Chongru chongru = new Chongru();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    chongru.m1();
                }
            }).start();
        }

    }
}
