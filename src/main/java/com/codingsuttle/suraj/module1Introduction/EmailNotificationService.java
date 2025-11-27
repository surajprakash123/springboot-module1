package com.codingsuttle.suraj.module1Introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNoti")
//@ConditionalOnProperty(name="notification.type",havingValue = "email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email sending.."+message);
    }
}
