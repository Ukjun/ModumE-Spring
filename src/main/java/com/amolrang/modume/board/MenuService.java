package com.amolrang.modume.board;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MenuService {

	public Object topView(Model model) {
		return "menu/topMenu";
	}

	public Object bottomView(Model model) {
		return "menu/bottomMenu";
	}

}
