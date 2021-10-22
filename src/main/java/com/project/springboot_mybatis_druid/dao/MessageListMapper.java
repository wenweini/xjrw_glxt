package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.MessageList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface MessageListMapper {
    int deleteByPrimaryKey(String id);

    int insert(MessageList record);

    MessageList selectByPrimaryKey(String id);

    List<MessageList> selectAll();

    int updateByPrimaryKey(MessageList record);
}