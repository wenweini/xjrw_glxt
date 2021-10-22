package com.project.springboot_mybatis_druid.dao;

import com.project.springboot_mybatis_druid.model.AccountList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AccountListMapper {
    int deleteByPrimaryKey(String id);

    int insert(AccountList record);

    AccountList selectByPrimaryKey(String id);

    List<AccountList> selectAll();

    int updateByPrimaryKey(AccountList record);
}