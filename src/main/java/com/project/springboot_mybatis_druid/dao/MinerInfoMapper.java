package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.MinerInfo;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MinerInfoMapper {
    int deleteByPrimaryKey(String clusterId);

    int insert(MinerInfo record);

    MinerInfo selectByPrimaryKey(String clusterId);

    List<MinerInfo> selectAll();

    int updateByPrimaryKey(MinerInfo record);
}