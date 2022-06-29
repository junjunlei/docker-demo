package com.jerry.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhanbo
 * @Description TODO
 * @Date 2021-08-10 18:42
 * @Version 1.0
 **/
@RestController
@RequestMapping
public class DockerController
{
	@GetMapping("/hello")
	public String test(){
		return "hello docker";
	}
}
