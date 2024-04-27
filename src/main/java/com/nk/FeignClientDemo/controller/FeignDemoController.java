package com.nk.FeignClientDemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nk.FeignClientDemo.utils.FeignUtilService;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
	
	@Autowired
	FeignUtilService feignUtilService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getEnteredValue(@RequestParam(name ="text") Optional<String> text){
		return text.orElse("Enter Value In URL");
	}
	
	@GetMapping("/student-name")
	public String getStudentDataName() {
		return feignUtilService.getStudentName();
	}
	
	@GetMapping("/student-address")
	public String getStudentDataAddress() {
		return feignUtilService.getStudentAddress();
	}
	@GetMapping("/student-status")
	public String getStudentDataStatus() {
		return feignUtilService.getStudentStatus();
	}

}
