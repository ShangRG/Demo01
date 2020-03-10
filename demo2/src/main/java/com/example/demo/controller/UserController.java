package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Controller
public class UserController {
	
	@Resource
	private UserRepository userRepository;
	
	@RequestMapping("byid")
    @ResponseBody
    public User getFruitsById(Long id) {
		User u = userRepository.byid(id);
        System.out.println("userRepository: " + userRepository);
        System.out.println("id: " + id);
        return u;
    }
	
	 @RequestMapping("/save")
	    @ResponseBody
	    public String saveFruits() {//注意 @RequestMapping("saveFruits")里的value值要与方法名称一致，否则找不到
		 User user = new User();
		 user.setName("张三");

		 userRepository.save(user);
		 
		 return "ok";
	    }


}
