package com.im.success.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.im.success.adverttarget.model.AdvertTargetVO;
import com.im.success.pub.util.ConstantUtil;
import com.im.success.service.IAdvertTargetService;
import com.im.success.service.impl.AdvertTargetServiceImpl;


public class AdvertTargetTest{


	private static final long serialVersionUID = -3461085864718631021L;
	
	@Autowired
	public static IAdvertTargetService adtService ;
	
	
	public static int insertVO() throws Exception
	{
		AdvertTargetVO adt = new AdvertTargetVO();
		
		adt.setAdt_ID("1");
		adt.setAdt_CatalogLevel((byte)1);
		adt.setAdt_Name("人群标签");
		adt.setAdt_Parent_ID("1");
		adt.setAdt_IsMatch(ConstantUtil.Byte_Zero);
		return adtService.insert(adt);
	}

	public void init(){
		try {
			System.out.println("测试结果"+insertVO()+"");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public static void main(String[] args){
		
		ApplicationContext context = new FileSystemXmlApplicationContext(
		          "src/conf/spring/applicationContext.xml");
		adtService = (IAdvertTargetService) context.getBean("advertTargetSV");
		
		try {
			insertVO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
