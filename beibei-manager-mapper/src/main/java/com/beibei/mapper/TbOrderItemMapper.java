package com.beibei.mapper;

import com.beibei.pojo.TbOrderItem;

public interface TbOrderItemMapper {
	int countByPrimaryKey();

	int deleteByPrimaryKey(String id);

	int insert(TbOrderItem tbOrderItem);

	TbOrderMapper selectByPrimaryKey(String id);

	int updateByPrimaryKey(TbOrderItem tbOrderItem);
}