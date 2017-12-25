package com.im.success.pub.util;

import java.io.Serializable;

public class ConstantUtil implements Serializable {


	private static final long serialVersionUID = 7785873468977402433L;
	
	public static final String EmptyStr="";
	
	/**
	 * Byte类型．【用于标识位,0 不启用 ; 1 启用】
	 *         【用于级别 0-9,数越小，级别越高】
	 *         【用户层次 0... 99为叶子】
	 */
	public static final Byte Byte_Zero = 0;
	/**
	 * Byte类型．【用于标识位,0 不启用 ; 1 启用】
	 *         【用于级别 0-9,数越小，级别越高】
	 *         【用户层次 0... 99为叶子】
	 */
	public static final Byte Byte_One = 1;
	/**
	 * Byte类型．【用于标识位,0 不启用 ; 1 启用】
	 *         【用于级别 0-9,数越小，级别越高】
	 *         【用户层次 0... 99为叶子】
	 */
	public static final Byte Byte_Two = 2;
	/**
	 * Byte类型．【用于标识位,0 不启用 ; 1 启用】
	 *         【用于级别 0-9,数越小，级别越高】
	 *         【用户层次 0... 99为叶子】
	 */
	public static final Byte Byte_Three = 3;
	/**
	 * Byte类型．用于标识位,0 不启用 ; 1 启用
	 *         用于级别 0-9,数越小，级别越高
	 *         用户层次 0... 99为叶子
	 */
	public static final Byte Byte_Four = 4;
	/**
	 * Byte类型．【用于标识位,0 不启用 ; 1 启用】
	 *         【用于级别 0-9,数越小，级别越高】
	 *         【用户层次 0... 99为叶子】
	 */
	public static final Byte Byte_NintyNine = 99;
	
	/**
	 * Byte类型．【10以下,PC】【20以下,MOBILE】【30以下,OTT】
	 */
	public static final Byte PlatType_PC = 10;
	/**
	 * Byte类型．【10以下,PC】【20以下,MOBILE】【30以下,OTT】
	 */
	public static final Byte PlatType_MP = 20;
	/**
	 * Byte类型．【10以下,PC】【20以下,MOBILE】【30以下,OTT】
	 */
	public static final Byte PlatType_OTT = 30;
}
