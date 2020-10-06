package com.amolrang.modume.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.amolrang.modume.user.model.UserDMI;


@Mapper
public interface UserMapper {
	public int insUser(UserDMI param);
	public UserDMI selUser(UserDMI param);
}
