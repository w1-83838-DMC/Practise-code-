package com.sunbeam.boot06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Primary
@Component
public class SmtpEmailServiceImpl implements NotificationService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendNotification(String to, String body) {

       
        try {
            MimeMessage message= javaMailSender.createMimeMessage();
            MimeMessageHelper helper= new MimeMessageHelper(message,true);
            helper.setSubject("Sunbeam Dmc course");
            helper.setTo(to);
            helper.setText(body,false);
            javaMailSender.send(message);
            System.out.println("Smtp Mail sent to "+ to + ":"+ body);

        } catch (MessagingException e) {
           
            System.out.println("Stmtp Mail sending failed");
            e.printStackTrace();
        }
        
        

        
    }

}
