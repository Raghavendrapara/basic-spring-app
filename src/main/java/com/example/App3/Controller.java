package com.example.App3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/edit")
	public String edit() {
		return "Welcome to Edit Page";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam String q) {
		return q;
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id) {
		return ""+(id*2);
	}

}
