package com.testreflect;

/**
 * @author luoly
 * @date 2018/9/28 09:46
 * @description
 */
public class HelloServiceImpl implements IHelloService{
    @Override
    public String sayHello(String content) {
        System.out.println("开始执行方法--》");
        return "said:"+content;
    }
}
