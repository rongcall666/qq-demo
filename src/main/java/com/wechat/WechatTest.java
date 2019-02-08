package com.wechat;


/**
 * @author:rong
 * @Description
 */
public class WechatTest {
    public static void main(String[] agrs) throws Exception{
        Thread mythread = new WechatThread();
        mythread.start();
    }
}
