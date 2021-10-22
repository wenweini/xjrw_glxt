package com.project.springboot_mybatis_druid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springboot_mybatis_druid.dao.NodeInfoMapper;
import com.project.springboot_mybatis_druid.model.NodeInfo;

@Service
public class MinerInfoService {
	@Autowired
	private NodeInfoMapper nodeInfoMapper;
	
	public List<NodeInfo> getNodeInfoList(){
		return nodeInfoMapper.selectAll();
	}
}
