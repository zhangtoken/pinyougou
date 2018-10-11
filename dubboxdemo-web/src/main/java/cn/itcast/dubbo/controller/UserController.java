package cn.itcast.dubbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.itcast.dubbo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Reference
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/showname")
	public String showname() {
	  return userService.getname();
		
	}
}