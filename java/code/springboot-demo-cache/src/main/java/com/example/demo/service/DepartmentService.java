package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    public DepartmentMapper departmentMapper;

    /**
     * 将方法的运行结果进行缓存;以后再要相同的数据直接从缓存中获取，不用调用方法
     * cacheNames/values : 指定缓存的组件名字
     * key : 缓存数据时使用的key：可以用他来指定。默认是使用方法参数的值
     *  1.方法返回值
     *
     *
     * @param id
     * @return
     */
    @Cacheable(value = "dept")
    public Department getById(Integer id){
        System.out.println("查询" + id + "号员工");
        Department departmentById = departmentMapper.getDepartmentById(id);
        return departmentById;
    }

    @CachePut(value = "dept", key = "#department.id")
    public Department updateDep(Department department){
        System.out.println("更新" + department.getId() + "号员工");
        departmentMapper.update(department);
        return department;
    }
}
