package com.amolrang.modume.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.amolrang.modume.models.UserVO;

public class SecurityUtils {

	public static UserVO getLoginUser(HttpServletRequest request) {
		HttpSession hs = request.getSession();
		return (UserVO)hs.getAttribute(Const.LOGIN_USER);
	}
	
	public static boolean isLogout(HttpServletRequest request) {				
		return getLoginUser(request) == null;
	}
	
	public static String generateSalt() {
		return BCrypt.gensalt();
	}

	public static String getEncrypt(String password, String salt) {

		return BCrypt.hashpw(password, salt);
	}

}
