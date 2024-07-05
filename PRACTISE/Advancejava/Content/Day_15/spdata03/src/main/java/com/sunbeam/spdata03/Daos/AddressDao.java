package com.sunbeam.spdata03.Daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata03.entities.Address;

public interface AddressDao extends JpaRepository<Address,Integer>{
    


}
