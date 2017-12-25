package com.im.success.pub.enumtype;

/**
 * 平台类型,可扩展
 * @author zyh
 *
 */
public enum PlatTypeEnumType  {
	
	PLATTYPE_default,
	//PC
	PLATTYPE_PC_IMAGE((byte) 1),
	PLATTYPE_PC_VEDIO((byte) 2),
	
	//MOBILE
	PLATTYPE_MP_IMAGE((byte) 11),
	PLATTYPE_MP_VEDIO((byte) 12),
	PLATTYPE_MP_NATIVE((byte) 13),
	
	//OTT
	PLATTYPE_OTT_IMAGE((byte) 21),
	PLATTYPE_OTT_VEDIO((byte) 22);
	
	private Byte value;
	
	PlatTypeEnumType(){
		this.setValue(null);
	}
	
	PlatTypeEnumType(byte value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(Byte value) {
		this.value = value;
	}
	
	public static void main(String[] args){
		
		System.out.println(PlatTypeEnumType.PLATTYPE_MP_VEDIO.name());
		System.out.println(PlatTypeEnumType.PLATTYPE_MP_VEDIO.getValue());
		System.out.println(PlatTypeEnumType.PLATTYPE_MP_VEDIO.toString());

	}

	public final String getDesc() {
		return new StringBuilder()
				.append(PLATTYPE_PC_IMAGE.name()).append(":").append(PLATTYPE_PC_IMAGE.getValue())
				.append("|")
				.append(PLATTYPE_PC_VEDIO.name()).append(":").append(PLATTYPE_PC_VEDIO.getValue())
				.append("|")
				.append(PLATTYPE_MP_IMAGE.name()).append(":").append(PLATTYPE_MP_VEDIO.getValue())
				.append("|")
				.append(PLATTYPE_MP_VEDIO.name()).append(":").append(PLATTYPE_MP_VEDIO.getValue())
				.append("|")
				.append(PLATTYPE_MP_NATIVE.name()).append(":").append(PLATTYPE_MP_NATIVE.getValue())
				.append("|")
				.append(PLATTYPE_OTT_IMAGE.name()).append(":").append(PLATTYPE_OTT_IMAGE.getValue())
				.append("|")
				.append(PLATTYPE_OTT_VEDIO.name()).append(":").append(PLATTYPE_OTT_VEDIO.getValue())
				.toString();
	}


	
		
	

}
