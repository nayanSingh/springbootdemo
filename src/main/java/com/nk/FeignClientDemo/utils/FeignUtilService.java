package com.nk.FeignClientDemo.utils;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo",url = "http://localhost:8080/student")
public interface FeignUtilService {
	
	
	@GetMapping("/name")
	String getStudentName();
	
	@GetMapping("/address")
	String getStudentAddress();
	
	@GetMapping("/status")
	String getStudentStatus();

}
