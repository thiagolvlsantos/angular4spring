package com.thiagolvlsantos;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/angular4spring")
public class ExemploRestController {

	@RequestMapping(path = "/echo")
	public String echo(@PathVariable(name = "msg") String msg) {
		return "Echo: ..." + msg;
	}
}
