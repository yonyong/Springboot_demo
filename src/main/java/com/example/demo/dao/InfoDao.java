package com.example.demo.dao;

import com.example.demo.pojo.Info;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Repository
public interface InfoDao {
    public ArrayList<Info> queryAllInfo();
}
