package com.im.success.dao;

import java.util.List;

import com.im.success.adverttarget.model.AdvertTargetSearchVO;
import com.im.success.adverttarget.model.AdvertTargetVO;

public interface IAdvertTargetDAO {

	public int insertAdt (AdvertTargetVO adt);
	
	public int updateAdt (AdvertTargetVO adt);
	
	public int deleteAdt (AdvertTargetVO adt);
	
	public AdvertTargetVO queryAdt(String adt_ID);
	
	public List<AdvertTargetVO> getAllofAdt();
	
	public List<AdvertTargetVO> queryAdts(AdvertTargetSearchVO searchVo);
	
	
	
}
