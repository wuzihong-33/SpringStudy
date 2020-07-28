package com.service;

import mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.ZoneId;
import java.util.List;

@Component
public class UserService {
    @Autowired
    ClassesMapper classesMapper;

    public ClassInfo getById(int id) {
        return classesMapper.getClassInfo(id);
    }

    public boolean insertClass(ClassInfo classInfo) {
        return classesMapper.insert(classInfo);
    }

//    @Transactional
//    public void transactionTest() {
//        classesMapper.insert(new ClassInfo("11","十一班"));
//        classesMapper.insert(new ClassInfo("12","十二班"));
//        classesMapper.insert(new ClassInfo("13","十三班"));
//    }



//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public ClassInfo getClassInfoById(long id) {
//        return jdbcTemplate.execute((Connection con) -> {
//            String querySql = "SELECT * FROM classes WHERE class_id = ?";
//            try (PreparedStatement ps = con.prepareStatement(querySql)){
//                ps.setObject(1,id);
//                try (ResultSet rs = ps.executeQuery()) {
//                    if (rs.next()) {
//                        return new ClassInfo(
//                            rs.getString("class_id"),
//                            rs.getString("name")
//                        );
//                    }else {
//                        throw new RuntimeException("user not found by id.");
//                    }
//                }
//            }
//        });
//    }
//    public List<ClassInfo> testClassInfo(int pageIndex) {
//        int limit = 3;
//        int offset = limit * (pageIndex - 1);
//        return jdbcTemplate.query("SELECT class_id,name FROM classes LIMIT ? OFFSET ?",
//                new Object[] { limit, offset },
//                new BeanPropertyRowMapper<>(ClassInfo.class));
//    }



}
