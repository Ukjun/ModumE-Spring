package com.amolrang.modume;

import java.util.Locale;

import org.springframework.ui.Model;

public class BoardController {
	public String mainView(Locale locale, Model model) {
		model.addAttribute("title","메인 뷰");
		return "main/main";
	}
}
