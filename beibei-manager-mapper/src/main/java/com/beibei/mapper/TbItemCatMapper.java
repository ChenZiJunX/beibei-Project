package com.beibei.mapper;

import java.util.List;

import com.beibei.pojo.TbItemCat;

public interface TbItemCatMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat tbItemCat);

    TbItemCat selectByPrimaryKey(Long id);
    
	List<TbItemCat> selectByParentID(Long id);

    int updateByPrimaryKey(TbItemCat tbItemCat);
}