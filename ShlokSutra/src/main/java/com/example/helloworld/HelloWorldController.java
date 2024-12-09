package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World! - A simple demo app by Shorya";
	}

	@GetMapping("/shlok")
	public  ResponseEntity<Map<String, String>> getShlok() {
		Map<String, String> response = new HashMap<>();
		response.put("shlok","कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।");
		response.put("translation", "http://localhost:8080/shlok/meaning");
		return ResponseEntity.ok(response);
	}

	@GetMapping("/shlok/meaning")
	public ResponseEntity<Map<String, String>> getShlokMeaning() {
		Map<String, String> response = new HashMap<>();
		response.put("Hindi Translation", "तुम्हारा अधिकार केवल कर्म करने पर है, फल पर नहीं।");
		response.put("English Translation", "Your right is only to perform your duty, not to the results.");
		return ResponseEntity.ok(response);
	}

}