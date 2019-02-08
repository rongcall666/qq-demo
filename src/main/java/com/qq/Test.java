package com.qq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


/**
 * @author:rong
 * @Description
 */
public class Test {
    public static void main(String[] agrs) throws Exception{
        Thread mythread = new Mythread();
        mythread.start();

    }
}
class Mythread extends Thread{
    @Override
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:qq/application-send.xml");
        QQMessageSend messageSend = context.getBean(QQMessageSend.class);
        while(true) {
            messageSend.send();
        }
    }
}
