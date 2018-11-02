package example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="errorHandling")
	public String getRemoteServcieInfo() {
		String url = "http://myservice/service/info";
		String ret = restTemplate.getForObject(url, String.class);
		return ret;
	}
	
	public String errorHandling() {
		return "the service is unavailable for now...";
	}
}
