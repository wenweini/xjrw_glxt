package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.StatusTable;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface StatusTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StatusTable record);

    StatusTable selectByPrimaryKey(Integer id);

    List<StatusTable> selectAll();

    int updateByPrimaryKey(StatusTable record);
}