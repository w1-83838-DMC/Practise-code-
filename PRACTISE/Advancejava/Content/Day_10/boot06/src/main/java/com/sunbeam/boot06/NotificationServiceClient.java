package com.sunbeam.boot06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceClient {

    //@Qualifier("mockEmailServiceImpl")
    @Autowired(required = false)
    private NotificationService service;
    
    public void notifyUser(String user,String message)
    {
        if(service!=null)
        service.sendNotification(user, message);
        else
        System.out.println("Cannot find Notifcation ");
       
    }

}
