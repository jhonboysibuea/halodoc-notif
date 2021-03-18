package com.halodoc.Test.controller;

import com.halodoc.Test.model.response.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.halodoc.Test.services.NotifService;

@RestController
@RequestMapping(path = "api/v1/notif")
public class NotificationController {

    @Autowired
    NotifService notifService;

    @GetMapping("/")
    public DataResponse getNotif(){
            return notifService.getNotif();
    }
}
