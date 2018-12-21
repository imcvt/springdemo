package com.testsycrinized;

/**
 * @author luoly
 * @date 2018/10/8 15:40
 * @description
 */
public class Chongru {

    int i = 100;

    public synchronized void m1() {

//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        i -- ;
        System.out.println("m1-->" + i);

        m2();
    }

    public void m2() {


        i -- ;
        System.out.println("m2-->" + i);
    }

}
