package com.wechat;

import org.apache.camel.component.jms.JmsTemporaryQueueEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author:rong
 * @Description
 */
@Component
public class WechatMessageSend {

    @Autowired
    private JmsTemplate jmsTemplate;


    public void send(){
        jmsTemplate.send(new WechatMessageCreator());
    }

}
