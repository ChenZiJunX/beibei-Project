package com.beibei.mapper;

import com.beibei.pojo.TbContent;

public interface TbContentMapper {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbContent tbContent);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKey(TbContent tbContent);
}