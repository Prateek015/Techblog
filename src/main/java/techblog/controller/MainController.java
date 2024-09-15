package techblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
		@RequestMapping("/")
		public String home()
		{
			return "index";
		}
		@RequestMapping("/Register")
		public String register()
		{
			return "Register";
		}
		@RequestMapping("/Login")
		public String login()
		{
			return "Login";
		}
	
}
