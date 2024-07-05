package com.sunbeam.spdata04.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.spdata04.entities.StdRoll;
import com.sunbeam.spdata04.entities.Student;

public interface StudentDao extends JpaRepository<Student,StdRoll>{


}
