package com.im.success.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.im.success.entity.IEntityVO;
import com.im.success.service.IAdvertTargetService;
import com.zyh.maple.framework.service.BaseService;

@Scope("singleton")
@Service("advertTargetSV")
public class AdvertTargetServiceImpl implements IAdvertTargetService{

	@Autowired
	private BaseService baseService;
	
	@Override
	public int insert(IEntityVO adt) throws Exception {
		
		if(adt == null)
			return 0;
		
		return baseService.insertObject("conf.mybatis.AdvertTargetMapper.insert", adt);
	}

	@Override
	public int update(IEntityVO adt) throws Exception {
		if(adt == null)
			return 0;
		
		return baseService.updateObject("conf.mybatis.AdvertTargetMapper.update", adt);
	}

	@Override
	public int delete(IEntityVO adt) throws Exception {

		if(adt == null)
			return 0;
		
		return baseService.deleteObject("conf.mybatis.AdvertTargetMapper.delete", adt);
	}

	@Override
	public IEntityVO query(IEntityVO searchVo) throws Exception {

		if(searchVo == null)
			return null;
		
		return (IEntityVO)baseService.getObject("conf.mybatis.AdvertTargetMapper.query", searchVo);
	}
	
	@Override
	public List<IEntityVO> queryAll() throws Exception {
		
		return (List<IEntityVO>)queryList(null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IEntityVO> queryList(IEntityVO searchVo) throws Exception {

	
		List<IEntityVO> list  = (List<IEntityVO>)baseService.getList("conf.mybatis.AdvertTargetMapper.getAllbyCond", searchVo);
		
		return list;
	}





}
