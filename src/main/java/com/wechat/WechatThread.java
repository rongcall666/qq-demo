package com.wechat;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.applet.Applet;

/**
 * @author:rong
 * @Description
 */
public class WechatThread extends  Thread{

    @Override
    public void run() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:wechat/application-wechat.xml");
        WechatMessageSend wechatMessageSend = applicationContext.getBean(WechatMessageSend.class);
        while (true){
            wechatMessageSend.send();
        }
    }
}
