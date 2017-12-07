package com.beibei.mapper;

import com.beibei.pojo.TbItemParamItem;

public interface TbItemParamItemMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem tbItemParamItem);

    TbItemParamItem selectByPrimaryKey(Long id);

    int updateByPrimaryKey(TbItemParamItem tbItemParamItem);
}