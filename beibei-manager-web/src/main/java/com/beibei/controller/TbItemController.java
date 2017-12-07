package com.beibei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beibei.pojo.TbItem;
import com.beibei.service.ITbItemService;
import com.beibei.utils.EUDataGridResult;
import com.beibei.utils.PageBean;

@Controller
@RequestMapping("item")
public class TbItemController {

	@Autowired
	private ITbItemService tbItemServiceImpl;
	
	
	@RequestMapping(value="findItem/{id}")
	@ResponseBody
	public TbItem findItem(@PathVariable Long id){
		TbItem tbItem = tbItemServiceImpl.selectByPrimaryKey(id);
		return tbItem;
	}
	
	@RequestMapping(value="list")
	@ResponseBody
	public EUDataGridResult findAllPages(@RequestParam(value="page",defaultValue="1") Integer page,@RequestParam(value="rows",defaultValue="30") Integer rows){
		PageBean pageBean = new PageBean();
		pageBean.setPageSize(rows);
		pageBean.countOffset(page, rows);
		List<TbItem> list = tbItemServiceImpl.selectAllPages(pageBean);
		Long total = tbItemServiceImpl.countByPrimaryKey();
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		result.setTotal(total);
		return result;
	}
	
	
	
	
	
	

	public ITbItemService getTbItemServiceImpl() {
		return tbItemServiceImpl;
	}

	public void setTbItemServiceImpl(ITbItemService tbItemServiceImpl) {
		this.tbItemServiceImpl = tbItemServiceImpl;
	}
	
}
