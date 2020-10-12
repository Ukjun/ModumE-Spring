package com.amolrang.modume.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amolrang.modume.utils.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

//	@Value("${video.location}")
//	private String videoLocation;
	
	@RequestMapping(value = "/main",method = RequestMethod.GET)
	public String index(Model model,Principal principal) throws IOException{
		model.addAttribute(StringUtils.TitleKey(),"ModumE");
		
		log.info("메인화면GET접근");
		if(principal != null) {
			log.info("유저정보 : {}",principal);
		}
		return "/index";
	}
	
}
