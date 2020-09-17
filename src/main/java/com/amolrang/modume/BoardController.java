package com.amolrang.modume;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	public String mainView( Model model) {
		model.addAttribute("title","메인 뷰");
		return "main/main";
	}
	
	@RequestMapping(value = "/board/stream", method = RequestMethod.GET)
	public String boardStream(Model model) {
		model.addAttribute("title","stream 뷰");
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/board/Current_Live");
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
	@RequestMapping(value = "/board/search", method = RequestMethod.GET)
	public String boardSearch(Model model) {
		model.addAttribute("title","search 뷰");
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view","/board/Stream_search");
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
}
