package com.demo.jenkins.jenkins_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/sonar")
	public String demoSonar() {
		return "Hello Demo Sonar";
	}

}
