package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department getDepartmentById(Integer id);

    @Update("update department set departmentName=#{departmentName} where id = #{id}")
    void update(Department department);

    @Delete("delete from department where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into department(departmentName) values(#{departmentName})")
    void insert(Department department);

    @Select("select * from department where departmentName = #{name}")
    Department getDepartmentByName(String name);
}
