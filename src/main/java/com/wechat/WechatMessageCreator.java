package com.wechat;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.Scanner;

/**
 * @author:rong
 * @Description
 */
public class WechatMessageCreator implements MessageCreator {

    private Scanner cin = new Scanner(System.in);

    public Message createMessage(Session session) throws JMSException {
        TextMessage textMessage = session.createTextMessage();
        System.out.println("请输入你要发送的信息");
        String str = cin.next();
        textMessage.setText(str);
        return textMessage;
    }
}
