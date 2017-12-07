package com.beibei.mapper;

import com.beibei.pojo.TbContentCategory;

public interface TbContentCategoryMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory tbContentCategory);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKey(TbContentCategory tbContentCategory);
}