package com.autoDeploy.enums;

import com.autoDeploy.util.NameValueEnum;
/**
 * 用户类型枚举
 * @author mills
 *
 */
public enum adminUserTypeEnum implements NameValueEnum{
	/**
	 * 1.所有
	 */
	ALL(1,"所有"),
	/**
	 * 2.授权管理员
	 */
	USE_ADMIN(2,"授权管理员"),
	/**
	 * 3.业务管理员
	 */
	BSS_ADMIN(3,"业务管理员")
	;
    /**
     * 数据库对应的值 1所有    2 授权管理员   3业务管理员
     */
    private Integer value;
	/**
	 * 页面显示的值
	 */
	private String displayName;
	
	public static String getDisplayName(Integer value){
		for (adminUserTypeEnum enums : adminUserTypeEnum.values()) {
			if(enums.value == value){
				return enums.displayName;
			}
		}
		return "";
	}
	
	private adminUserTypeEnum(Integer value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}
	
	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return value;
	}



}
