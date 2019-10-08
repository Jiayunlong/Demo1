package com.example.demo;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	public DepartmentMapper departmentMapper;

	@Test
	public void contextLoads() {
		Department d = departmentMapper.getDepartmentById(1);
		System.out.println(d);
	}

}
