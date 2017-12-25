package com.im.success.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.im.success.advertorder.model.AdvertOrderMPExtendVO;
import com.im.success.advertorder.model.AdvertOrderOTTExtendVO;
import com.im.success.advertorder.model.AdvertOrderPCExtendVO;
import com.im.success.advertorder.model.AdvertOrderVO;
import com.im.success.entity.IEntityVO;
import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.IAdvertOrderService;
import com.zyh.maple.framework.service.BaseService;

@Scope("singleton")
@Service("advertOrderSV")
public class AdvertOrderServiceImpl implements IAdvertOrderService {

	@Autowired
	private BaseService baseService;
	
	
	@Override
	public int insert(IEntityVO ado) throws Exception {
		
		if(ado == null)
			return 0;	
		int result = 0;
		
		 result=baseService.insertObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.insert", ado);
		
		if(ado instanceof AdvertOrderPCExtendVO)
			result = baseService.insertObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.insertPC", ado);
		if(ado instanceof AdvertOrderMPExtendVO)
			result = baseService.insertObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.insertMP", ado);
		if(ado instanceof AdvertOrderOTTExtendVO)
			result = baseService.insertObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.insertOTT", ado);

		return result;
	}

	@Override
	public int update(IEntityVO ado) throws Exception {
		
		if(ado == null)
			return 0;
		
		int result = 0;
		
		if(ado instanceof AdvertOrderPCExtendVO)
			result = baseService.updateObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.update", ado);
		if(ado instanceof AdvertOrderMPExtendVO)
			result = baseService.updateObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.update", ado);
		if(ado instanceof AdvertOrderOTTExtendVO)
			result = baseService.updateObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.update", ado);

		return result;
	}

	@Override
	public int delete(IEntityVO ado) throws Exception {
		
		if(ado == null)
			return 0;
		
		String ado_ID = ((AdvertOrderVO)ado).getAdo_ID();

		if(ConstantUtil.EmptyStr.equals(ado_ID))
			return 0;
		
		int result =  baseService.deleteObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.delete", ado_ID);
		
		return result;
	}


/*	@Override
	public IEntityVO queryAdo(IEntityVO searchVo) throws Exception {
		
		if(searchVo == null)
			return null;
			
		return queryAdo(searchVo.getAdo_ID());
	}

	@Override
	public IEntityVO queryAdo(String ado_ID) throws Exception {

		if(ConstantUtil.EmptyStr.equals(ado_ID))
			return null;
		
		return (IAdvertOrderVO)baseService.getObject("", ado_ID);
	}*/





	@Override
	public IEntityVO query(IEntityVO searchVo) throws Exception {

		return (IEntityVO)baseService.getObject("conf.mybatis.conf.mybatis.AdvertTargetMapper.query", searchVo);
	}

	@Override
	public List<IEntityVO> queryAll() throws Exception {
		
		return queryList(null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IEntityVO> queryList(IEntityVO searchVo) throws Exception {
		// TODO Auto-generated method stub
		return (List<IEntityVO>)baseService.getList("conf.mybatis.conf.mybatis.AdvertTargetMapper.queryList", searchVo);
	}


}
