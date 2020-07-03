package JavaWebWithSpringBoot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {
	@RequestMapping({"api/home", "api/"})
	@ResponseBody
	public String getHome() {
		return "Welcome to student api";
	}
}
