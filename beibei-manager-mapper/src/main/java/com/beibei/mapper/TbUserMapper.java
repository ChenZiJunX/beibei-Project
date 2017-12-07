package com.beibei.mapper;

import com.beibei.pojo.TbUser;

public interface TbUserMapper {
	int countByPrimaryKey();

	int deleteByPrimaryKey(Long id);

	int insert(TbUser tbUser);

	TbUser selectByPrimaryKey(Long id);

	int updateByPrimaryKey(TbUser tbUser);
}