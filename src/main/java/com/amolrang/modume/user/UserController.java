package com.amolrang.modume.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amolrang.modume.ViewRef;
import com.amolrang.modume.menu.MenuService;
import com.amolrang.modume.user.model.UserDTO;
import com.google.api.client.json.Json;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private MenuService menu;
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String Info(Model model) {
		model.addAttribute("title","my view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/info");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/login");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/join");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@ResponseBody
	@RequestMapping("/chkId")
	public String chkId(UserDTO param) {
		param.setUser_pw("");		
		int result = service.login(param);
		return String.format("{\"result\": %s}", result);
	}
}
