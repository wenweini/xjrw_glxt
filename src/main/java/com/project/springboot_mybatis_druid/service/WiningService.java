package com.project.springboot_mybatis_druid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.springboot_mybatis_druid.dao.WiniMapper;
import com.project.springboot_mybatis_druid.model.Wini;

@Service
public class WiningService {
	@Autowired
	private WiniMapper winiMapper;
	
	public Wini getWiningByPk(Integer id){
		return winiMapper.selectByPrimaryKey(id);
	}
	
	public PageInfo<Wini> selectWiningListPage(Integer page, Integer pageSize, Wini wini){
		PageInfo<Wini> pageInfo = null;
        try{
            PageHelper.startPage(page,pageSize);
            List<Wini> winingList = winiMapper.selectAll(wini);
            pageInfo = new PageInfo<Wini>(winingList);
        }catch(Exception e){
            e.printStackTrace();
        }
		return pageInfo;
	}
}
