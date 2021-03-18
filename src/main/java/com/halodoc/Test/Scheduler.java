package com.halodoc.Test;

import com.halodoc.Test.model.UserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.halodoc.Test.repository.UserLogRepository;

import java.util.List;
import java.util.Optional;


@Configuration

public class Scheduler {

    @Autowired
    UserLogRepository userLogRepository;

    @Value("${halodoc.sent.max}")
    int max;

    @Scheduled(cron = "${halodoc.sent.notif:0/10 * * * * *}")
    void proceedAllNotification() {
        System.out.println("Scheduler -> proceedAllNotification()");
        List<Object[]> userLog = userLogRepository.getUserLog(max).orElseThrow();
        for (Object[] ul : userLog) {
            String userId = (String) ul[0];
            String channelName = (String) ul[1];
            String type=(String) ul[2];
            sendNotification(userId,channelName,type);
        }
    }

    //this function will send notification to customer, but actually this case not defined in the scenario so we will handle it later
    // we will just print log for this
    private void sendNotification(String userId,String channelName,String type){
        //TODO send notification
        System.out.println(String.format("Send notification to user %s using channel %s and Type %s",userId,channelName,type));
    }
}
