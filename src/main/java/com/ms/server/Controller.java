package com.ms.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@RequestMapping("docker")
public String msg() {
	return "this is from docker";
}
}
