package com.pinyougou.sellergoods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;


@Service
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	TbBrandMapper tbBrandMapper;
	
	@Override
	public List<TbBrand> findAll() {	
		return tbBrandMapper.selectByExample(null);
	}

	@Override
	public PageResult<TbBrand> findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByExample(null);
		return new PageResult<TbBrand>(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbBrand tbBrand) {
		tbBrandMapper.insert(tbBrand);
	}

	@Override
	public void update(TbBrand tbBrand) {
		tbBrandMapper.updateByPrimaryKey(tbBrand);	
	}

	@Override
	public TbBrand findOne(Long id) {
		return tbBrandMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(Long[] ids) {
		for (Long id : ids) {
			tbBrandMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public List<Map> selectOptionList() {
		return tbBrandMapper.selectOptionList();
	}

//	@Override
//	public PageResult<TbBrand> findPage(int pageNum, int pageSize, TbBrand tbBrand) {
//		PageHelper.startPage(pageNum, pageSize);
//		TbBrandExample example = new TbBrandExample();
//		example.
//		Page<TbBrand> page = (Page<TbBrand>) tbBrandMapper.selectByExample(null);
//		return new PageResult<TbBrand>(page.getTotal(), page.getResult());
//		return null;
//	}

}
