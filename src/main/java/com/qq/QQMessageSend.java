package com.qq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author:weijr
 * @Description
 * @Date:create in ${time} ${date}
 */
@Component
public class QQMessageSend {

    @Autowired
    private JmsTemplate jmsTemplate;


    public void send(){
        System.out.println("请输入要发送的内容！");
        jmsTemplate.send(new QQMessageCreator());
    }

}
