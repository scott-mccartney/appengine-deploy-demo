package com.scottmcc.gcp.appenginedeploydemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${message}")
	String message;

	@GetMapping(value = "demo", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> displayHelloMessage() {
		return ResponseEntity.ok(message);
	}
}
