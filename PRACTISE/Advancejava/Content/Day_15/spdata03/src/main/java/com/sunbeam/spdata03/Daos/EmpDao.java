package com.sunbeam.spdata03.Daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sunbeam.spdata03.entities.Emp;

public interface EmpDao extends JpaRepository<Emp,Integer>{

    List<Emp> findBySalBetweenOrderBySalDesc(double min,double max);

    @Modifying
    @Query("SELECT e.dept.deptno,SUM(e.sal), AVG(e.sal) FROM Emp As e GROUP BY e.dept.deptno")
    List<Object[]> deptwiseSalStatistics();

    @Modifying
    @Query("UPDATE Emp e SET e.sal=e.sal+?2 WHERE e.dept.deptno=?1")
    int updateSalOfDept(int deptno,double inc);

    @Modifying
    @Query("DELETE FROM Emp e WHERE e.sal>:p_sal")
    int deleteEmpOfSalGreaterThan(@Param("p_sal") double sal);

    @Query("SELECT DISTINCT e.dept.deptno FROM Emp e")// jpql query
    List<Integer> getDistinctDeptnos();





}
