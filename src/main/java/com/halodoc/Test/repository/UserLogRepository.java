package com.halodoc.Test.repository;

import com.halodoc.Test.model.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserLogRepository extends JpaRepository<UserLog,String> {
    //get all notification count for each user
    @Query(value = "\n" +
            "select ul.user_id_id,nc.channel_name,lt.type, count(*) from t_user_log ul \n" +
            "join t_log_type lt on ul.log_type_id_id=lt.id \n" +
            "join t_notification_channel nc on nc.log_type_id=lt.id \n" +
            "group by ul.user_id_id,nc.channel_name,lt.type \n" +
            "having count(*)>?1",nativeQuery = true)
    Optional<List<Object[]>> getUserLog(int max);
}
