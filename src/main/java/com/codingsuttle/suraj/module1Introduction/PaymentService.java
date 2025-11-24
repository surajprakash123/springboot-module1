package com.codingsuttle.suraj.module1Introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaymentService {

    public void pay(){
        System.out.println("Paying");
    }
}
