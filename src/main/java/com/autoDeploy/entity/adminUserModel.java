package com.autoDeploy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.ibatis.annotations.Result;

import com.autoDeploy.enums.adminUserStateEnum;
import com.autoDeploy.enums.adminUserTypeEnum;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;

/**
 * 用户bean
 * @author mills
 *
 */
@Entity
@Data
@TableName("admin_user_model")
public class adminUserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7288476492026677180L;
	/**
	 * 主键id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	/**
	 * 用户名
	 */
	@Column(nullable=false,unique=true,length=20,name="user_name")
	@NotNull
	@Size(min=5,max=15)
	private String userName;
	/**
	 * 登陆账号
	 */
	@Column(nullable=false,unique=true,length=15,name="login_account")
	@NotNull
	@Size(min=5,max=15)
	private String loginAccount;
	
	@Column(nullable=false,name="login_password")
	@NotNull
	private String loginPassword;
	
	/**
	 * 用户类型
	 */
	@Column(nullable=false,length=8,name="user_type")
	@NotNull
	private Integer userType;
	/**
	 * 用户状态
	 */
	@Column(nullable=false,name="user_state")
	@NotNull
	private Integer userState;
	/**
	 * 手机号码
	 */
	@Column(nullable=false,length=15)
	@NotNull
	private String phone;
	/**
	 * 备注
	 */
	@Column(nullable=false)
	private String remark;
	
	/**
	 * 重置密码操作 0:无操作权限 1 有操作权限
	 */
	@Column(name="reset_passwords",columnDefinition="int default 0")
	private Integer resetPasswords;
	
	/**
	 * 修改操作：0 无操作权限 1有权限
	 */
	@Column(name="user_modify",columnDefinition="int default 0")
	private Integer userModify;
	
	/**
	 * 珊瑚操作  0无权限  1有权限
	 */
	@Column(name="user_delete",columnDefinition="int default 0")
	private Integer userDelete;
	/**
	 * 用户类型名称
	 */
	private String userTypeName;
	
	private String userStateName;
	
	

	public String getUserTypeName() {
		return adminUserTypeEnum.getDisplayName(getUserType());
	}

	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}
	
	public String  getUserStateName() {
		return adminUserStateEnum.getDisplayName(getUserState());
	}
	
	public void setUserStateName(String userStateName) {
		this.userStateName=userStateName;
	}
}
