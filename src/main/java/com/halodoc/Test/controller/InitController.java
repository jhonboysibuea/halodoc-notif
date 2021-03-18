package com.halodoc.Test.controller;

import com.halodoc.Test.model.LogType;
import com.halodoc.Test.model.User;
import com.halodoc.Test.model.UserLog;
import com.halodoc.Test.model.response.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.halodoc.Test.repository.LogTypeRepository;
import com.halodoc.Test.repository.UserLogRepository;
import com.halodoc.Test.repository.UserRepository;

import java.util.Random;

@RestController("")
@RequestMapping(path = "api/v1/init")
public class InitController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserLogRepository userLogRepository;

    @Autowired
    LogTypeRepository logTypeRepository;

    //master table
    @GetMapping("/user")
    DataResponse insertToUser(){

        for(int i=1;i<200;i++){
          User user=new User();
          user.setId(""+i);
          user.setName("user "+i);
          userRepository.save(user);
        }
        return new DataResponse("200","success",null);
    }

    //master
    @GetMapping("/log-type")
    DataResponse insertToLogType (){
        LogType logType1=new LogType();
        logType1.setId("1");
        logType1.setType("info");

        LogType logType2=new LogType();
        logType2.setId("2");
        logType2.setType("warning");

        LogType logType3=new LogType();
        logType3.setId("3");
        logType3.setType("critical");

        LogType logType4=new LogType();
        logType4.setId("4");
        logType4.setType("blocker");

        logTypeRepository.save(logType1);
        logTypeRepository.save(logType2);
        logTypeRepository.save(logType3);
        logTypeRepository.save(logType4);

        return new DataResponse("200", "success", null);
    }

    @GetMapping("/user-log")
    DataResponse insertToUserLog() {
        Random rand=new Random();
        int idLog=rand.nextInt(4)+1;
        for(int i=1;i<200;i++){
            UserLog userLog = new UserLog();
            User user=userRepository.findById("1").orElseThrow();


            LogType logType =logTypeRepository.findById(String.valueOf(idLog)).orElseThrow();
            userLog.setUserId(user);
            userLog.setLogTypeId(logType);
            userLogRepository.save(userLog);
        }
        return new DataResponse("200", "success", null);
    }

    @GetMapping("/channel")
    DataResponse insertToChannel() {
        Random rand=new Random();
        int idLog=rand.nextInt(4)+1;
        for(int i=1;i<200;i++){
            UserLog userLog = new UserLog();
            User user=userRepository.findById("1").orElseThrow();


            LogType logType =logTypeRepository.findById(String.valueOf(idLog)).orElseThrow();
            userLog.setUserId(user);
            userLog.setLogTypeId(logType);
            userLogRepository.save(userLog);
        }
        return new DataResponse("200", "success", null);
    }


}
