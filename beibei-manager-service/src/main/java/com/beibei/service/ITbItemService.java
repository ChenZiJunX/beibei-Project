package com.beibei.service;

import java.util.List;

import com.beibei.pojo.TbItem;
import com.beibei.utils.PageBean;

public interface ITbItemService {
	Long countByPrimaryKey();

    boolean deleteByPrimaryKey(Long id);

    boolean insert(TbItem tbItem);

    TbItem selectByPrimaryKey(Long id);
    
    List<TbItem> selectAllPages(PageBean pageBean);

    boolean updateByPrimaryKey(TbItem tbItem);
}
