package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

public interface BrandService {
	
	public List<TbBrand> findAll();

	public PageResult<TbBrand> findPage(int page, int rows);
	
	//public PageResult<TbBrand> findPage(int page, int rows, TbBrand tbBrand);
	
	public void add(TbBrand tbBrand);
	
	public void update(TbBrand tbBrand);
	
	public TbBrand findOne(Long id);
	
	public void delete(Long[] ids);
	
	public List<Map> selectOptionList();
}
