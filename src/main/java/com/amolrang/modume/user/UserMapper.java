package com.amolrang.modume.user;

import org.apache.ibatis.annotations.Mapper;

import com.amolrang.modume.models.UserDMI;
import com.amolrang.modume.models.UserParam;
import com.amolrang.modume.models.UserVO;

@Mapper
public interface UserMapper {
	public int insUser(UserParam p);
	public UserDMI selUser(UserParam param);
}
