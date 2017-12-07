package com.beibei.mapper;

import java.util.List;

import com.beibei.pojo.TbItem;
import com.beibei.utils.PageBean;

public interface TbItemMapper {
    Long countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbItem tbItem);

    TbItem selectByPrimaryKey(Long id);
    
    List<TbItem> selectAllPages(PageBean pageBean);

    int updateByPrimaryKey(TbItem tbItem);
}