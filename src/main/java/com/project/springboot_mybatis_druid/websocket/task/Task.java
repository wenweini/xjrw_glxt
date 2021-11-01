package com.project.springboot_mybatis_druid.websocket.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.project.springboot_mybatis_druid.service.MinerInfoService;
import com.project.springboot_mybatis_druid.websocket.server.WebSocketServer;
@Component
public class Task {
    @Autowired
    private WebSocketServer webSocketServer;
    
    @Autowired
	private MinerInfoService minerInfoService;
    /**
     * @throws Exception
     */
    @Scheduled(cron="0/60 * *  * * ? ")
    public void JqcaseSearch() {
        try {
        	String msg = JSON.toJSONString(minerInfoService.selectMinerInfoList());
            System.out.println("这是心跳:"+msg);
            webSocketServer.sendInfo(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}