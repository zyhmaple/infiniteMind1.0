package com.im.success.service;

import java.util.List;

import com.im.success.entity.IEntityVO;

public interface IIMBaseService {
	
	public int insert(IEntityVO vo) throws Exception;
	
	public int inserts(List<Object> list) throws Exception;
	
	public int update(IEntityVO vo)throws Exception;
	
	public int delete(IEntityVO vo)throws Exception;
	
	public IEntityVO query(IEntityVO searchVo)throws Exception;

	public List<IEntityVO> queryAll()throws Exception;
	
	public List<IEntityVO> queryList(IEntityVO searchVo)throws Exception;
}
