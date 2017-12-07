package com.beibei.service;

import java.util.List;

import com.beibei.pojo.TbItemCat;
import com.beibei.utils.EasyUITreeNode;

public interface ITbItemCatService {
    int countByPrimaryKey();

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat tbItemCat);

    TbItemCat selectByPrimaryKey(Long id);
    
	List<EasyUITreeNode> selectByParentID(Long id);

    int updateByPrimaryKey(TbItemCat tbItemCat);
    
}
