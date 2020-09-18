package com.amolrang.modume.user;

import org.apache.ibatis.annotations.Mapper;

import com.amolrang.modume.user.model.UserVO;

@Mapper
public interface UserMapper {
	public int insUser(UserVO p);
}
