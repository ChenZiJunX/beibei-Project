package com.beibei.mapper;

import com.beibei.pojo.TbItemDesc;

public interface TbItemDescMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc tbItemDesc);

    TbItemDesc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKey(TbItemDesc tbItemDesc);
}