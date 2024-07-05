package com.sunbeam.mobileshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.mobileshop.daos.MobileDao;
import com.sunbeam.mobileshop.entities.Mobiles;


@RequestMapping("/v2")
@RestController
public class MobileRestController {

    @Autowired
    private MobileDao mobileDao;


    @GetMapping("/mobile")
    public List<Mobiles>getAllMobile() {
        List<Mobiles> list = mobileDao.findAll();
        return list;
    }
    
}
