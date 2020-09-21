package com.amolrang.modume.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.amolrang.modume.Const;
import com.amolrang.modume.ViewRef;
import com.amolrang.modume.menu.MenuService;
import com.amolrang.modume.user.model.UserParam;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private MenuService menu;
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String _Info(Model model) {
		model.addAttribute("title","my view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/info");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String _login(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/login");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String _login(UserParam param,HttpSession hs, RedirectAttributes ra) {
		int result = service.login(param);
		if (result == Const.SUCCESS) {
			hs.setAttribute(Const.LOGIN_USER, param);
			return "redirect:/";
		}
		String msg = null;
		if(result == Const.NO_ID) {
			msg = "아이디를 확인해주세요.";
		}else if(result == Const.NG_PW) {
			msg = "비밀번호를 확인해주세요";
		}
		
		param.setMsg(msg);
		ra.addFlashAttribute("data",param);
		
		return "redirect:/user/login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String _logout(Model model,HttpSession hs) {
		hs.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String _join(Model model) {
		model.addAttribute("title","login view");
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/user/join");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	
	@ResponseBody
	@RequestMapping("/chkId")
	public String _chkId(UserParam param) {
		param.setUser_pw("");		
		int result = service.login(param);
		return String.format("{\"result\": %s}", result);
	}
}
