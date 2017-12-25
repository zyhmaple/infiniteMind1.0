package com.im.success.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.im.success.entity.IEntityVO;
import com.im.success.service.IAdvertiserService;
import com.zyh.maple.framework.service.BaseService;

@Scope("singleton")
@Service("advertiserSV")
public class AdvertiserServiceImpl implements IAdvertiserService {

	@Autowired
	private BaseService baseService;
	
	@Override
	public int insert(IEntityVO adr) throws Exception {
		// TODO Auto-generated method stub
		
		int result = baseService.insertObject("conf.mybatis.AdvertiserMapper.insert", adr);
				
		return result;
	}

	@Override
	public int update(IEntityVO adr) throws Exception {
		// TODO Auto-generated method stub
		
		int result = baseService.updateObject("conf.mybatis.AdvertiserMapper.update", adr);
				
		return result;
	}

	@Override
	public int delete(IEntityVO adr) throws Exception {
		// TODO Auto-generated method stub
		
		int result = baseService.deleteObject("conf.mybatis.AdvertiserMapper.delete", adr);
		
		return result;
	}


	@Override
	public IEntityVO query(IEntityVO searchVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<IEntityVO> queryAll() throws Exception {

		@SuppressWarnings("unchecked")
		List<IEntityVO> result = baseService.getList("conf.mybatis.AdvertiserMapper.queryAll", null);
		
		return result;
	}

	@Override
	public List<IEntityVO> queryList(IEntityVO searchVo) throws Exception {

		@SuppressWarnings("unchecked")
		List<IEntityVO> result = baseService.getList("conf.mybatis.AdvertiserMapper.getAgentOrAdr", searchVo);
		
		return result;
	}

}
