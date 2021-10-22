package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.ErrorSector;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ErrorSectorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ErrorSector record);

    ErrorSector selectByPrimaryKey(Integer id);

    List<ErrorSector> selectAll();

    int updateByPrimaryKey(ErrorSector record);
}