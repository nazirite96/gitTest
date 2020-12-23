package gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index.do")
	public String index() {
		return "index";
	}
	@RequestMapping("jjindex.do")
	public String jjindex() {
		return "jjindex";
	}
}
