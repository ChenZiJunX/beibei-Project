package com.beibei.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.beibei.service.ITbItemCatService;
import com.beibei.utils.EasyUITreeNode;
import com.beibei.utils.IDUtils;
import com.beibei.utils.PictureResult;

@Controller
@RequestMapping("item/cat")
public class TbItemCatController {
	@Autowired
	private ITbItemCatService tbItemCatServiceImpl;

	@RequestMapping(value = "list")
	@ResponseBody
	public List<EasyUITreeNode> findItemcatTree(@RequestParam(value = "id", defaultValue = "0") Long id) {
		List<EasyUITreeNode> list = tbItemCatServiceImpl.selectByParentID(id);
		return list;
	}

	@RequestMapping(value = "pic/upload")
	@ResponseBody
	public PictureResult uploda(@RequestParam MultipartFile uploadFile, HttpSession session) throws Exception {
		PictureResult result = null;
		try {
			// 上传文件功能实现
			// 判断文件是否为空
			if (uploadFile.isEmpty())
				return null;
			// 获取上传的绝对路径
			String path = session.getServletContext().getRealPath("/upload");

			// 取原始文件名
			String originalFilename = uploadFile.getOriginalFilename();
			// 新文件名
			String newFileName = IDUtils.genImageName() + originalFilename.substring(originalFilename.lastIndexOf("."));
			// 转存文件
			InputStream is = null;
			OutputStream os = null;
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			// 通过commons-io包提供的工具来完成拷贝
			try {
				is = uploadFile.getInputStream();
				bis = new BufferedInputStream(is);
				os = new FileOutputStream(path + "/" + newFileName);
				bos = new BufferedOutputStream(os);
				FileCopyUtils.copy(bis, bos);
				bos.flush();
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			String resultPath = "/upload/" + newFileName;
			result = new PictureResult(0, resultPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 返回上传结果
		return result;

	}

	public ITbItemCatService getTbItemCatServiceImpl() {
		return tbItemCatServiceImpl;
	}

	public void setTbItemCatServiceImpl(ITbItemCatService tbItemCatServiceImpl) {
		this.tbItemCatServiceImpl = tbItemCatServiceImpl;
	}

}
