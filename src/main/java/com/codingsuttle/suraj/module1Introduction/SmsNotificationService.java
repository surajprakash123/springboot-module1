package com.codingsuttle.suraj.module1Introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("smsNoti")
//@ConditionalOnProperty(name="notification.type",havingValue = "sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("sms sending.."+message);
    }
}
