package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.NodeInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface NodeInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(NodeInfo record);

    NodeInfo selectByPrimaryKey(String id);

    List<NodeInfo> selectAll();

    int updateByPrimaryKey(NodeInfo record);
}