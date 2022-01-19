package com.nttdata.micro1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping(path="/micro1")
	public String micro1() {
		return "Hello Micro1";
	}
}
