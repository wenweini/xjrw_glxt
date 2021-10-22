package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.BlockList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface BlockListMapper {
    int deleteByPrimaryKey(String blockId);

    int insert(BlockList record);

    BlockList selectByPrimaryKey(String blockId);

    List<BlockList> selectAll();

    int updateByPrimaryKey(BlockList record);
}