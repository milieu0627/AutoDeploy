package com.autoDeploy.enums;

import com.autoDeploy.util.NameValueEnum;
/**
 * 用户状态枚举
 * @author mills
 *
 */
public enum adminUserStateEnum implements NameValueEnum{
	/**
	 * 0.所有
	 */
	ALL(0,"所有"),
	/**
	 * 1.失效
	 */
	LOSE_efficacy(1,"失效"),
	/**
	 * 2.有效
	 */
	VALID(2,"有效"),
	/**
	 * 3 锁定
	 */
	LOCK(3,"锁定"),
	;
    /**
     * 数据库对应的值 0所有   1.失效  2.有效 3 锁定
     */
    private Integer value;
	/**
	 * 页面显示的值
	 */
	private String displayName;
	
	public static String getDisplayName(Integer value){
		for (adminUserStateEnum enums : adminUserStateEnum.values()) {
			if(enums.value == value){
				return enums.displayName;
			}
		}
		return "";
	}
	
	private adminUserStateEnum(Integer value, String displayName) {
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
