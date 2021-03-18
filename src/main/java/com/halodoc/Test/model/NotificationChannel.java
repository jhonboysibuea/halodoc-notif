package com.halodoc.Test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="t_notification_channel")
public class NotificationChannel {
    @Id
    @Column(length = 32)
    String id;

    @ManyToOne
    LogType logType;

    String channelName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
