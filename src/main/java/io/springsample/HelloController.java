package io.springsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "Hello World! comment by github + local";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		return "hello";
	}

}
