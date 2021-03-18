package com.halodoc.Test.repository;

import com.halodoc.Test.model.LogType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTypeRepository extends JpaRepository<LogType,String> {
}
