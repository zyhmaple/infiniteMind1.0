package com.im.success.service;

import java.util.List;

import com.im.success.entity.IEntityVO;

public interface IIMBaseService {
	
	public int insert(IEntityVO adr) throws Exception;
	
	public int update(IEntityVO adr)throws Exception;
	
	public int delete(IEntityVO adr)throws Exception;
	
	public IEntityVO query(IEntityVO searchVo)throws Exception;

	public List<IEntityVO> queryAll()throws Exception;
	
	public List<IEntityVO> queryList(IEntityVO searchVo)throws Exception;
}
