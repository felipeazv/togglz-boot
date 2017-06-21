package togglz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	FeatureService service;
	
	@GetMapping
	public String getFeature1() {
		return service.feature1();
	}
}
