package com.codingsuttle.suraj.module1Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {
  //  @Autowired
  // NotificationService notificationService;
   // final NotificationService notificationServiceObj;
   // public Module1IntroductionApplication(@Qualifier("smsNoti") NotificationService notificationServiceObj){
     //   this.notificationServiceObj=notificationServiceObj;
   // }

   // public Module1IntroductionApplication( NotificationService notificationServiceObj){
    //       this.notificationServiceObj=notificationServiceObj;
      //   }
    @Autowired
   Map<String,NotificationService> notificationServiveMap=new HashMap<>();

	public static void main(String[] args) {

        SpringApplication.run(Module1IntroductionApplication.class, args);

	}

    @Override
    public void run(String... args) throws Exception {
        //NotificationService notificationService=new EmailNotificationService();
        //notificationServiceObj.send("Hello");
        for(var notificationService:notificationServiveMap.entrySet()){
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }
        }
    }

