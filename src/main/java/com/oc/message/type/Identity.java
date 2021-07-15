/**
 * 
 */
package com.oc.message.type;

/**
 * @Description: 用户身份表示
 * @author chuangyeifang
 * @createDate 2019年10月18日
 * @version v 1.0
 */
@SuppressWarnings("unused")
public enum Identity {
	/**
	 * 系统身份
	 */
	SYS,
	/**
	 * 空身份
	 */
	NULL,
	/**
	 * 客户身份
	 */
	CUSTOMER,
	/**
	 * 客服身份
	 */
	WAITER;
	
	Identity() { }
}
