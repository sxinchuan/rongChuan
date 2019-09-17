package com.sxinchuan.liao.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author User
 * 第一个控制层类
 *
 */
@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
	public String helloWorld() {
		System.out.println("成功了");
		return "love";
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("成功了");
		return "love/sss";
	}
}
