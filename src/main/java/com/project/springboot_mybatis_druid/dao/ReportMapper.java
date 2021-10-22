package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.Report;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Report record);

    Report selectByPrimaryKey(Integer id);

    List<Report> selectAll();

    int updateByPrimaryKey(Report record);
}