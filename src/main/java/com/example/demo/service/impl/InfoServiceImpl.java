package com.example.demo.service.impl;

import com.example.demo.dao.InfoDao;
import com.example.demo.pojo.Info;
import com.example.demo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService{

    @Autowired
    InfoDao infoDao;
    @Override
    public ArrayList<Info> queryAllInfo() {

        return infoDao.queryAllInfo();
    }
}
