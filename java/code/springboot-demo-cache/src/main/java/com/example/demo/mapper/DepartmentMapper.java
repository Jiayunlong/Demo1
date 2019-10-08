package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDepartmentById(Integer id);

    @Update("update department set departmentName=#{departmentName} where id = #{id}")
    void update(Department department);

    @Delete("delete from department where id = #{id}")
    public void deleteById(Integer id);

    @Insert("insert into department(departmentName) values(#{departmentName})")
    public void insert(Department department);
}
