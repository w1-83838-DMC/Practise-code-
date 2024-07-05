package com.sunbeam.mobile.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.mobile.daos.MobileDao;
import com.sunbeam.mobile.dtos.MobileForm;
import com.sunbeam.mobile.entities.Mobile;

@Transactional
@Service
public class MobileService {

    @Autowired
    private MobileDao mobileDao;

    public List<Mobile>findAllMobiles() {
        return mobileDao.findAll();
       
    }

    public Mobile findMobileById(int mobileId) {
        Optional<Mobile> om = mobileDao.findById(mobileId);
        return om.isPresent()? om.get(): null;
    }

    public Mobile saveMobile(MobileForm mf) {
        Mobile m= new Mobile(0, mf.getName(), mf.getRam(), mf.getStorage(), mf.getCompany(), mf.getPrice(),mf.getImageFile().getOriginalFilename());
        return mobileDao.save(m);
    }



}
