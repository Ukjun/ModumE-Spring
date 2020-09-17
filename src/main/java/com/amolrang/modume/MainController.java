package com.amolrang.modume;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainView(Locale locale, Model model) {
		logger.info("Welcome MainView! The client locale is {}.", locale);
		
		BoardController bc = new BoardController();
		MenuController menu = new MenuController();
		model.addAttribute("topView",menu.topView(model));
		model.addAttribute("view",bc.mainView(model));
		model.addAttribute("bottomView",menu.bottomView(model));
		return "viewer/default";
	}
}
