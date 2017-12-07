package com.beibei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beibei.mapper.TbItemMapper;
import com.beibei.pojo.TbItem;
import com.beibei.service.ITbItemService;
import com.beibei.utils.PageBean;

@Service
public class TbItemServiceImpl implements ITbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public Long countByPrimaryKey() {
		return tbItemMapper.countByPrimaryKey();
	}

	@Override
	public boolean deleteByPrimaryKey(Long id) {
		return false;
	}

	@Override
	public boolean insert(TbItem tbItem) {
		return false;
	}

	@Override
	public TbItem selectByPrimaryKey(Long id) {
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		return tbItem;
	}


	@Override
	public List<TbItem> selectAllPages(PageBean pageBean) {
		if(pageBean==null)
			return null;
		return tbItemMapper.selectAllPages(pageBean);
	}

	@Override
	public boolean updateByPrimaryKey(TbItem tbItem) {
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	public TbItemMapper getTbItemMapper() {
		return tbItemMapper;
	}

	public void setTbItemMapper(TbItemMapper tbItemMapper) {
		this.tbItemMapper = tbItemMapper;
	}
	
}
