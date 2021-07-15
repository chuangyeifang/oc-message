/**
 * 
 */
package com.oc.message.type;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年8月28日
 * @version v 1.0
 */
@SuppressWarnings("unused")
public enum Transport{

	/**
	 * websocket 通讯
	 */
	WEBSOCKET,
	/**
	 * 长轮询
	 */
	POLLING,
	/**
	 * socket通讯
	 */
	SOCKET;
	
	Transport() { }
}
