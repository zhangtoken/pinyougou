package cn.itcast.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.itcast.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getname() {
		return "tesedubbox";
	}

}
