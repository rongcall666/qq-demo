package com.wechat;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 * @author:rong
 * @Description
 */
public class WechatMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage)message;
        if(textMessage != null){
            try {
                System.out.println("收到的消息为:" + textMessage.getText());
            }catch (JMSException e){

            }
        }
    }
}
