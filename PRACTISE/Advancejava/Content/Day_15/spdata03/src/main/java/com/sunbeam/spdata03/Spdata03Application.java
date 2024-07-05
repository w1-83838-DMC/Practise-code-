package com.sunbeam.spdata03;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.spdata03.Daos.AddressDao;
import com.sunbeam.spdata03.Daos.DeptDao;
import com.sunbeam.spdata03.Daos.EmpDao;
import com.sunbeam.spdata03.Daos.MeetingDao;
import com.sunbeam.spdata03.entities.Dept;
import com.sunbeam.spdata03.entities.Emp;

@SpringBootApplication
public class Spdata03Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Spdata03Application.class, args);
	}
	@Autowired
	private EmpDao empDao;

	@Autowired
	private MeetingDao meetingDao;


	@Autowired
	private AddressDao addressDao;

	@Autowired
	private DeptDao deptDao;

	@Transactional
	@Override
	public void run(String... args) throws Exception {

		// for empid we find De

		/* Many To Many 
		Optional<Meeting> me = meetingDao.findById(1);
		if(me.isPresent())
		{
			Meeting m=me.get();
			System.out.println(m);
			for(Emp e:m.getEmpList())
			{
				System.out.println(e);
			}
		}

		Optional<Emp> oe = empDao.findById(7934);
		if(oe.isPresent())
		{
			Emp e=oe.get();
			System.out.println(e);
			for(Meeting m:e.getMeetList())
			{
				System.out.println(m);
			}
		}else
		{
			System.out.print("Not found");
		}
		*/

		// one to one

		/* 
		Optional<Address> oa = addressDao.findById(7782);
		if(oa.isPresent())
		{
			Address a=oa.get();
			System.out.println(a);
			Emp e=a.getEmp();
			System.out.println(e);
		}else
		{
			System.out.println("Address Not found");
		}

		System.out.println(" ");

		*/
		/* 

		Optional<Emp> oe = empDao.findById(7782);
		if(oe.isPresent())
		{
			Emp e=oe.get();
			System.out.println(e);
			Address a=e.getAddress();
			System.out.println(a);
			
		}else
		{
			System.out.print("Not found");
		}
		*/ 

		// Many To one (Many Employee have 1 department)

		/* 
		Optional<Dept> od = deptDao.findById(10);
		if(od.isPresent())
		{
			Dept d=od.get();
			System.out.println(d);
			for(Emp e:d.getEmpList())
			{
				System.out.println(e);
			}

		}
		*/

		// List<Emp> list=empDao.findBySalBetweenOrderBySalDesc(1000, 2000);
		// for(Emp e: list)
		// {
		// 	System.out.println(e);
		// }

			// List<Object[]> result = empDao.deptwiseSalStatistics();
			// for(Object[] res: result)
			// {
			// 	System.out.println(" Deptno "+ res[0]+ " Total Sal "+ res[1]+ "Avg Sal"+ res[2]);
			// }

			// int count= empDao.updateSalOfDept(10, 100);
			// System.out.println("Updated Rows"+ count);

			// int count2=empDao.deleteEmpOfSalGreaterThan(5000);
			// System.out.println("Deleted Rows "+ count2);

			// List<Integer> depts=empDao.getDistinctDeptnos();
			// System.out.println("All Depts: "+ depts);








		
		
	

	

	








		
	}

}
