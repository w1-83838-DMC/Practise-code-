package com.sunbeam.spdata03.Daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata03.entities.Dept;

public interface DeptDao extends JpaRepository<Dept,Integer>{

    

}
