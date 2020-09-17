package com.amolrang.modume;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value = "/user/info", method = RequestMethod.GET)
	public String Info(Model model) {
		model.addAttribute("title","my view");
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/info");
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("title","login view");
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/login");
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
	
	@RequestMapping(value = "/user/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("title","login view");
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/join");
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
}
