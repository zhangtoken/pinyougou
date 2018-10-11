package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
import entity.Result;

@RestController
@RequestMapping("/brand")
public class BrandController {
	
	@Reference
	BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();
	}
	
	@RequestMapping("/findPage")
	public PageResult<TbBrand> findPage(int page,int rows){
		return brandService.findPage(page,rows);
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand tbBrand){
		
		try {
			brandService.add(tbBrand);
			return new Result(true,"新增成功");
		} catch (Exception e) {
			return new Result(false,"新增失败");
		}
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand tbBrand){
		try {
			brandService.update(tbBrand);
			return new Result(true,"更新成功");
		} catch (Exception e) {
			return new Result(false,"更新失败:"+e.getMessage());
		}
	}
	
	@RequestMapping("/findOne")
	public TbBrand findOne(Long id){
		return brandService.findOne(id);
	}
	
	@RequestMapping("/delete")
	public Result delete(Long[] ids){
		try {
			brandService.delete(ids);
			return new Result(true,"删除成功");
		} catch (Exception e) {
			return new Result(false,"删除失败");
		}	
	}
	
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList(){
		return brandService.selectOptionList();
	}
}
