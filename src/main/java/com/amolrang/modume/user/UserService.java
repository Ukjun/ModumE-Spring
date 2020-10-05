package com.amolrang.modume.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amolrang.modume.models.UserDMI;
import com.amolrang.modume.models.UserParam;
import com.amolrang.modume.utils.Const;
import com.amolrang.modume.utils.SecurityUtils;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	public int login(UserParam param) {
		if(param.getUser_id().equals("")) {return Const.NO_ID;}
		UserDMI dbUser = mapper.selUser(param);
		if (dbUser == null) {return Const.NO_ID;}
		
		String salt = dbUser.getSalt();
		String encryptPw = SecurityUtils.getEncrypt(param.getUser_pw(), salt);

		if (!encryptPw.equals(dbUser.getUser_pw())) {return Const.NG_PW;}
		
		param.setUser_pw(null);
		param.setNm(dbUser.getNm());
		param.setProfile_img(dbUser.getProfile_img());
		return Const.SUCCESS;
	}


	public int join(UserParam param) {
		String pw = param.getUser_pw();
		String salt = SecurityUtils.generateSalt();
		String encryptPw = SecurityUtils.getEncrypt(pw, salt);

		param.setUser_pw(encryptPw);
		param.setSalt(salt);

		return mapper.insUser(param);
	}

}
