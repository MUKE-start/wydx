package com.ibm.cn;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.cn.entity.Employee;
import com.ibm.cn.entity.User;

import com.ibm.cn.service.EmployeeService;
import com.ibm.cn.service.UserService;

@SpringBootTest
class WydxProject11ApplicationTests {
	
	@Autowired
	UserService userService;
	
	@Autowired
	EmployeeService employeeService;

	@Test
	void contextLoads() {
			User u = new User();
			u.setId(1);
			u.setSex("男");
			u.setPassword("123");
			u.setRealname("TT");
			u.setUsername("MF");
			userService.addUser(u);
			System.out.println("添加成功！");
		}
	
	@Test
	void testUpdata() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setAge(20);
		employee.setSalary(10000);
		employee.setName("MUKE");
		System.out.println(employee);
		employeeService.updataEmp(employee);
		System.out.println("添加成功！");
	}
		
}


