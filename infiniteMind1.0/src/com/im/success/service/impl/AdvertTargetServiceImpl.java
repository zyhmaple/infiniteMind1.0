package com.im.success.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.im.success.adverttarget.model.AdvertTargetRelVO;
import com.im.success.adverttarget.model.AdvertTargetVO;
import com.im.success.adverttarget.model.AdvertTargetVO2;
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
		
		if(adt == null )
			return 0;
		if(adt instanceof AdvertTargetVO )
		 return baseService.insertObject("conf.mybatis.AdvertTargetMapper.insert", adt);
		else if(adt instanceof AdvertTargetVO2 )
			 return baseService.insertObject("conf.mybatis.AdvertTargetMapper.insertAdt", adt);
		else if(adt instanceof AdvertTargetRelVO )
			 return baseService.insertObject("conf.mybatis.AdvertTargetMapper.insertAdtRel", adt);
		return 0;
	}
	
	@Override
	public int inserts(List<Object> adts) throws Exception {
		
		if(adts == null ||adts.size()==0)
			return 0;
		int result = 0;
		for(Object adt : adts)
		{
			if(adt instanceof AdvertTargetVO )
				result = baseService.insertObject("conf.mybatis.AdvertTargetMapper.insert", adt);
			else if(adt instanceof AdvertTargetVO2 )
				result = baseService.insertObject("conf.mybatis.AdvertTargetMapper.insertAdt", adt);
			else if(adt instanceof AdvertTargetRelVO )
				result = baseService.insertObject("conf.mybatis.AdvertTargetMapper.insertAdtRel", adt);
		}
		
		return result;
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
