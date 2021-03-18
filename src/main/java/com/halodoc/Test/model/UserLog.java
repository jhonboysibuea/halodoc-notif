package com.halodoc.Test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "t_user_log")
public class UserLog {

    @Id
    @Column(length = 32)
    String id;
    @ManyToOne
    User userId;
    @ManyToOne
    LogType logTypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public LogType getLogTypeId() {
        return logTypeId;
    }

    public void setLogTypeId(LogType logTypeId) {
        this.logTypeId = logTypeId;
    }
}
