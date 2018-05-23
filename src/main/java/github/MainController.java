package github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String mainPage(){
		
		return "Hello World! A nice day! By frank ker in Germany!";
		
	}
}
