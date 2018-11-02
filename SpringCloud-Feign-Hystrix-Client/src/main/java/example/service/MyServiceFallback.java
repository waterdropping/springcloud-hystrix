package example.service;

import org.springframework.stereotype.Component;

@Component
public class MyServiceFallback implements MyService {

	@Override
	public String getServiceInfo() {
		return "the service is unavailable for now...";
	}

}
