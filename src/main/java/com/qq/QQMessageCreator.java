package com.qq;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.Scanner;

/**
 * @author:rong
 * @Description
 */
public class QQMessageCreator implements MessageCreator {
    public Message createMessage(Session session) throws JMSException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Message message = session.createTextMessage(str);
        return message;
    }
}
