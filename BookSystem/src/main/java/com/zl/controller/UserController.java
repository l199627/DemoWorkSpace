package com.zl.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.pojo.User;
import com.zl.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Autowired
	private UserService us;
	@RequestMapping("/login.do")
	@ResponseBody//����ֻ��Ҫ����springMVC�������ص�������Ҫ��ʽ��json��ʽ,������Ӧ
	public Map<String,Object> login(User user,HttpSession session) {
		Map<String,Object> json=new HashMap<String,Object>();
		user =us.login(user);
		if(user!=null) {
			json.put("flag", true);
			session.setAttribute("loginUser", user);
		}else {
			json.put("flag", false);
		}
		return json;
	}
}
