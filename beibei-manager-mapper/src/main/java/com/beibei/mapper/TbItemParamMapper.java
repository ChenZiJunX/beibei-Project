package com.beibei.mapper;

import com.beibei.pojo.TbItemParam;

public interface TbItemParamMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbItemParam tbItemParam);

    TbItemParam selectByPrimaryKey(Long id);

    int updateByPrimaryKey(TbItemParam tbItemParam);
}