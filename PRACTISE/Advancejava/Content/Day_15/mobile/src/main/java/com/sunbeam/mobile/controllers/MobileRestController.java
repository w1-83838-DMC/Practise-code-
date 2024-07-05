package com.sunbeam.mobile.controllers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.mobile.dtos.MobileForm;
import com.sunbeam.mobile.dtos.ShopResult;
import com.sunbeam.mobile.entities.Mobile;
import com.sunbeam.mobile.services.MobileService;



@RestController
public class MobileRestController {
    @Value("${images.dirPath}")
    public String imagesDirPath="/tmp/";
    @Autowired
    private MobileService mobileservice;
    @GetMapping("/mobiles")
    public ShopResult<?> getAllMobiles() {
       List<Mobile> list=mobileservice.findAllMobiles(); 
       return ShopResult.success(list);  
    }

    @GetMapping("/mobiles/{id}")
    public ShopResult<?> getMobilesById(@PathVariable("id") int mobileId)
    {
        Mobile m=mobileservice.findMobileById(mobileId);
        return ShopResult.success(m);
    }

    @PostMapping("/mobiles")
    public ShopResult<?> postMobile(MobileForm mf) throws IllegalStateException, IOException {
        File destFile= new File(imagesDirPath + mf.getImageFile().getOriginalFilename());
        mf.getImageFile().transferTo(destFile);
        Mobile m= mobileservice.saveMobile(mf);
        return ShopResult.success(m);

        
    }
    
    
}
