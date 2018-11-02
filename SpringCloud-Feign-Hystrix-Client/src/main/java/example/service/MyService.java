package example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="myservice", fallback=MyServiceFallback.class)
public interface MyService {
	
	@GetMapping("/service/info")
	public String getServiceInfo();
	
}
