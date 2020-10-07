package com.amolrang.modume;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainFrame {
	@RequestMapping("/main")
    @ResponseBody
    public String main(){
        return "main page";
    }

    @RequestMapping("/securepage")
    @ResponseBody
    public String securitypage(){
        return "secure page";
    }
}



//@Controller
//@RequestMapping(value = "/", method = RequestMethod.GET)
//public class mainFrame {
//	@RequestMapping(value = "*")
//	public String mainViewFrame(Model model) {
//		model.addAttribute("viewPort", "main/main");
//		model.addAttribute("board", "discord/discord");
//		return "viewer/default";
//	}
//}
