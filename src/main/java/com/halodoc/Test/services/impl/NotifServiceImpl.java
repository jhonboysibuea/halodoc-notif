package com.halodoc.Test.services.impl;

import com.halodoc.Test.model.response.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.halodoc.Test.repository.LogTypeRepository;
import com.halodoc.Test.repository.UserRepository;
import com.halodoc.Test.services.NotifService;

@Service
public class NotifServiceImpl implements NotifService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    LogTypeRepository logTypeRepository;

    @Override
    public DataResponse getNotif() {
        return null;
    }

}
