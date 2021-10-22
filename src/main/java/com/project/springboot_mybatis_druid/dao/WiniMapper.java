package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.Wini;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WiniMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wini record);

    Wini selectByPrimaryKey(Integer id);

    List<Wini> selectAll(@Param("wini")Wini wini);

    int updateByPrimaryKey(Wini record);
    
    int getCount();
}