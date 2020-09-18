package com.amolrang.modume.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amolrang.modume.ViewRef;
import com.amolrang.modume.menu.MenuService;

@Controller
public class UserController {
	
	@Autowired
	private MenuService menu;
	@RequestMapping(value = "/user/info", method = RequestMethod.GET)
	public String Info(Model model) {
		model.addAttribute("title","my view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/info");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/login");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/user/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/join");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
}
