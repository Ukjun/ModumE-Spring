package com.amolrang.modume.user;

import org.apache.ibatis.annotations.Mapper;

import com.amolrang.modume.user.model.UserDMI;
import com.amolrang.modume.user.model.UserDTO;
import com.amolrang.modume.user.model.UserVO;

@Mapper
public interface UserMapper {
	public int insUser(UserDTO p);
	public UserDMI selUser(UserDTO param);
}
