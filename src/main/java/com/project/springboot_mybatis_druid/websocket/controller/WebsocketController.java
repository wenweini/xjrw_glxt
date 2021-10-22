package com.project.springboot_mybatis_druid.websocket.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.springboot_mybatis_druid.websocket.server.WebSocketServer;


@Controller
public class WebsocketController {

    @Autowired
    private WebSocketServer webSocketServer;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/webSocket")
    public String socket() {
//        ModelAndView mav=new ModelAndView("/webSocket");
//        mav.addObject("userId", userId);
        return "123";
    }
    @PostMapping("/sendAllWebSocket")
	public String test() {
		String text="你们好！这是websocket群体发送！";
		try {
			webSocketServer.sendInfo(text);
		}catch (IOException e){
			e.printStackTrace();
		}
		return text;
	}

}