package com.im.success.adverttarget.model;

import com.im.success.entity.EntityVOAnnotation;

/**
 * ssp与dsp广告目标群体mapping
 * @author zyh
 *
 */
public class AdvertTargetMappingVO extends AdvertTargetVO {


	private static final long serialVersionUID = -3519832976845618527L;
	
	@EntityVOAnnotation(alias = "DSP的AdvertTarget的ID")
	private String adt_MasterID;
	
	@EntityVOAnnotation(alias = "")
	private String adt_SspID;
	
	@EntityVOAnnotation(alias = "")
	private String adt_SspTargetID;
	
	@EntityVOAnnotation(alias = "")
	private String adt_SspTargetName;

}
