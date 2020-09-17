package com.amolrang.modume;

import org.springframework.ui.Model;

public class MenuController {

	public Object topView(Model model) {
		return "menu/topMenu";
	}

	public Object bottomView(Model model) {
		return "menu/bottomMenu";
	}

}
