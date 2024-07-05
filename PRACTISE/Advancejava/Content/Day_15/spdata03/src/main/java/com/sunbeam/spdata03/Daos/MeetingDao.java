package com.sunbeam.spdata03.Daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata03.entities.Meeting;

public interface MeetingDao extends JpaRepository<Meeting,Integer>{
    


}
