package com.cg.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.model.Login;
import com.cg.trainee.service.ITraineeService;

@Controller
public class LoginController {

	
	@Autowired
	ITraineeService service;
	
	@RequestMapping("/index")
	public String goToIndex(){
		return "loginDetails";
	}
	
	@RequestMapping("/checkLogin")
	public String check(@RequestParam("username") String username, @RequestParam("password") String password){
		List<Login> logList = service.getLoginDetails();
		
		int flag = 0;
		
		for(Login log:logList){

			if(log.getUsername().equals(username) && log.getPassword().equals(password)){
				flag = 1;
				break;
			}
		}
		
		if(flag == 0){
			return "loginDetails";
		}
		else{
			return "redirect:trainee/choice.obj";
			//return "options";
		}
		
	}
}
