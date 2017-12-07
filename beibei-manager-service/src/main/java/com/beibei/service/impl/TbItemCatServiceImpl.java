package com.beibei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beibei.mapper.TbItemCatMapper;
import com.beibei.pojo.TbItemCat;
import com.beibei.service.ITbItemCatService;
import com.beibei.utils.EasyUITreeNode;


@Service
public class TbItemCatServiceImpl implements ITbItemCatService {
	@Autowired
	private TbItemCatMapper TbItemCatMapper;

	@Override
	public int countByPrimaryKey() {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return 0;
	}

	@Override
	public int insert(TbItemCat tbItemCat) {
		return 0;
	}

	@Override
	public TbItemCat selectByPrimaryKey(Long id) {
		return null;
	}

	@Override
	public List<EasyUITreeNode> selectByParentID(Long id) {
		List<TbItemCat> tItemCats = TbItemCatMapper.selectByParentID(id);
		List<EasyUITreeNode> list = new ArrayList<EasyUITreeNode>();
		for (TbItemCat cat : tItemCats) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(cat.getId());
			node.setText(cat.getName());
			node.setState(cat.getIsParent() == 1 ? "closed" : "open");
			list.add(node);
		}
		return list;
	}

	@Override
	public int updateByPrimaryKey(TbItemCat tbItemCat) {
		return 0;
	}














	public TbItemCatMapper getTbItemCatMapper() {
		return TbItemCatMapper;
	}

	public void setTbItemCatMapper(TbItemCatMapper tbItemCatMapper) {
		TbItemCatMapper = tbItemCatMapper;
	}

}
