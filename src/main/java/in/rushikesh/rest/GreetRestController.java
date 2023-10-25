package in.rushikesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String port = env.getProperty("server.port");
		String msg = "Good Morning!! {Server running on : "+port+"}";
		return msg;
	}

	@GetMapping("/other")
	public String getOtherGreetMsg() {
		String msg = "Other Greet msg";
		return msg;
	}
}
