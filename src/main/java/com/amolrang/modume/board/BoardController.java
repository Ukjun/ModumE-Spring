package com.amolrang.modume.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amolrang.modume.ViewRef;
import com.amolrang.modume.menu.MenuService;

@Controller
@RequestMapping("/board")
public class BoardController {
	public String mainView( Model model) {
		model.addAttribute("title","main view");
		return "main/main";
	}
	
	@RequestMapping(value = "/stream", method = RequestMethod.GET)
	public String boardStream(Model model) {
		model.addAttribute("title","stream view");
		MenuService menu = new MenuService();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/board/Current_Live");
		model.addAttribute("discord","discord/discord");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String boardSearch(Model model) {
		model.addAttribute("title","search view");
		MenuService menu = new MenuService();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/board/Stream_search");
		model.addAttribute("discord","discord/discord");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
}
