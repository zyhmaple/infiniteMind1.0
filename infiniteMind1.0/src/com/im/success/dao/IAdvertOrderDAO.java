package com.im.success.dao;

import java.util.List;

import com.im.success.advertorder.model.AdvertOrderSearchVO;
import com.im.success.advertorder.model.AdvertOrderVO;
import com.im.success.entity.IAdvertOrderVO;

/**
 * 广告订单ADO接口
 * @author zyh
 *
 */
public interface IAdvertOrderDAO {


	public int insertAdo(IAdvertOrderVO order);
	
	public int updateAdo(IAdvertOrderVO order);
	
	public int deleteAdo(IAdvertOrderVO order);
	
	public int queryAdo(String ado_ID);
	
	public List<AdvertOrderVO> queryAdo(AdvertOrderSearchVO searchAdo);
	
	
}
