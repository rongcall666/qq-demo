package com.qq;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author:rong
 * @Description
 */
@Component(value = "qqMessageListener")
public class QQMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try{
            System.out.println("接收到的信息为:"+((TextMessage) message).getText());
        }catch (Exception e){

        }
    }
}
