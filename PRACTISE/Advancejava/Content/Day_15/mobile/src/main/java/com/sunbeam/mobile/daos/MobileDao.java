package com.sunbeam.mobile.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.mobile.entities.Mobile;

public interface MobileDao extends JpaRepository<Mobile,Integer>{

}
