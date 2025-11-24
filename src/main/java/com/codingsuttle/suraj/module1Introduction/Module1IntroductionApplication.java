package com.codingsuttle.suraj.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
    @Autowired
    PaymentService paymentService1;
    @Autowired
    PaymentService paymentService2;

	public static void main(String[] args) {

        SpringApplication.run(Module1IntroductionApplication.class, args);
      //  PaymentService paymentServiceObj=new PaymentService();
       // paymentServiceObj.pay();
       // PaymentService paymentService;
       // paymentService.pay();
	}

    @Override
    public void run(String... args) throws Exception {
        // paymentServic.pay();
        System.out.println(paymentService1);
        System.out.println(paymentService2);
        paymentService1.pay();
        paymentService2.pay();
        //new code
        //drefhgfr
    }
}
