package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.service.TestService;

@RestController
@RequestMapping("ribbon")
public class TestRibbonHystrixClient {

	@Autowired
	private TestService testService;
	
	@GetMapping("/get")
	public String visitService() {
		return testService.getRemoteServcieInfo();
	}
}
