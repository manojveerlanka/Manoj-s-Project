package com.manojss.api1;

import java.security.Identity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication {
	
	

	
	
	@GetMapping("login")
	public void login() {
		
		System.out.println("Login API");
	}



	@GetMapping("api/match/test")
	public String getScores(@RequestParam String score, @RequestParam int id, @RequestParam Boolean flag) {
	    if (flag) {
	        return "score: " + score + ", find id: " + id + ", flag: " + flag;
	    } else {
	        return "Invalid flag value!";
	    }
	}
	
	
	@GetMapping("{seo}/dp/{product}")
	public String seo(@PathVariable String seo, @PathVariable int product) {
		
		return "seo:"+seo+"  producctid:"+product;
		
	}
	
}

	
