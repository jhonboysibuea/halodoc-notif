package com.halodoc.Test.repository;

import com.halodoc.Test.model.NotificationChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifationChannelRepository  extends JpaRepository<NotificationChannel,String> {

}
