package com.beibei.mapper;

import com.beibei.pojo.TbOrder;

public interface TbOrderMapper {
	int countByPrimaryKey();

	int deleteByPrimaryKey(String orderId);

	int insert(TbOrder tbOrder);

	TbOrderMapper selectByPrimaryKey(String orderId);

	int updateByPrimaryKey(TbOrder tbOrder);
}