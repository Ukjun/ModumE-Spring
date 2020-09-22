package com.amolrang.modume;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amolrang.modume.board.BoardController;
import com.amolrang.modume.menu.MenuService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainView(Locale locale, Model model) {
		logger.info("Welcome MainView! The client locale is {}.", locale);
		
		BoardController bc = new BoardController();
		MenuService menu = new MenuService();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view",bc.mainView(model));
		model.addAttribute("discord","discord/discord");
		model.addAttribute("bottomView",menu.bottomView(model));
		return ViewRef.VIEWER_DEFAULT;
	}
}
