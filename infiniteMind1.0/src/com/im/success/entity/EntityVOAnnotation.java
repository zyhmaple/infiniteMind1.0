package com.im.success.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface EntityVOAnnotation {

	/**
	 * 注解，名称
	 * @return
	 */
	public abstract String alias()  ;
	
	/**
	 * 对象，属性类型
	 * @return
	 */
	public abstract String entityType() default("");
	
	/**
	 * 枚举描述
	 * @return
	 */
	public abstract String EnumDesc() default ("");
	
	/**
	 * 分割字符串
	 * @return
	 */
	public abstract String splitChar() default("");
	
	/**
	 * key-value
	 * @return
	 */
	public abstract String[] keys() default{};
	
	/**
	 * key-value
	 * @return
	 */
	public abstract String[] values()default{};
	
	/**
	 * class
	 */
	@SuppressWarnings("rawtypes")
	public abstract Class type() default  EntityVOAnnotation.class;

}
