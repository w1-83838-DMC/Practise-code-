package com.sunbeam.boot06;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("service")
public class MockSmsServiceImpl implements NotificationService{


    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Sending Sms to "+ to + ":"+ message);
    }

}
