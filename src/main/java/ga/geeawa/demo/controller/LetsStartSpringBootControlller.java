package ga.geeawa.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LetsStartSpringBootControlller {

	@RequestMapping("/springboot")
	public String test(Model model) {
		model.addAttribute("message", "Let's Start SpringBoot");
		return "test";
	}
}
