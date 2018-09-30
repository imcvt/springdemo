package com.testreflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author luoly
 * @date 2018/9/28 09:47
 * @description
 */
public class TestReflect {

    public static void main(String[] args) {
//        testInvocke();
        testGetClass();
    }


    public static void testGetClass() {
        Person p1 = new Person("p1name", 11);

        Person p2 = new Person("p2name", 18);

        Class c1 = p1.getClass();

        System.out.println("getclasstest-->" + p1.getClass().equals(p2.getClass()));


    }

    public static void testInvocke() {
        try {

            //获取字节码文件，所有的类型的class字节码文件在内存中是Class（大写的C）类型的对象，比如Person.class-->class Class{name,field,contructor}
            Class<?> clas = Class.forName("com.testreflect.HelloServiceImpl");
            Method method = clas.getMethod("sayHello", new Class[]{String.class});
            System.out.println(method.invoke(clas.newInstance(), new Object[]{"ccccc"}));


//            Class<?> c = Class.forName("com.test.TestCompareTo");
//            //指定方法和方法参数类型，注意int 不能是Integer类型
//            Method m = c.getDeclaredMethod("tReflect", new Class[]{String.class});
//            //传入参数值，按顺序哦
//            m.invoke(c.newInstance(), "12345");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
