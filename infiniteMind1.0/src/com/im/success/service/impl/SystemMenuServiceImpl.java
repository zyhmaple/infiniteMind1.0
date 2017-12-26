package com.im.success.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.im.success.entity.IEntityVO;
import com.im.success.service.ISystemMenuService;
import com.im.success.system.model.SystemMenuVO;
import com.zyh.maple.framework.service.BaseService;

@Scope("singleton")
@Service("SystemMenuSV")
public class SystemMenuServiceImpl implements ISystemMenuService {

	@Autowired
	private BaseService baseService;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SystemMenuVO> getSystemMenuList() throws Exception {

		return (List<SystemMenuVO>)baseService.getList("conf.mybatis.SystemMenuMapper.getSystemMenuList", null);
	}

	@Override
	public String getMenuActionUrl(String menu_ID) throws Exception {

		return (String) baseService.getObject("conf.mybatis.SystemMenuMapper.getSystemMenuList", menu_ID);
	}

	@Override
	public int insert(IEntityVO menuVO) throws Exception {
		
		return (int) baseService.insertObject("conf.mybatis.SystemMenuMapper.insert", menuVO);
	}

	@Override
	public int delete(IEntityVO menuVO) throws Exception {

		return (int) baseService.deleteObject("conf.mybatis.SystemMenuMapper.delete", menuVO);

	}
	
	@Override
	public int update(IEntityVO menuVO) throws Exception {

		return (int) baseService.updateObject("conf.mybatis.SystemMenuMapper.update", menuVO);
	}

	@Override
	public IEntityVO query(IEntityVO searchVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntityVO> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntityVO> queryList(IEntityVO searchVo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserts(List<Object> vos) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
