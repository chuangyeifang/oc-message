/**
 * 
 */
package com.oc.message.type;

/**
 * @Description:
 * @author chuangyeifang
 * @createDate 2019年10月19日
 * @version v 1.0
 */
@SuppressWarnings("unused")
public enum PacketType {

	/**
	 * 心跳请求
	 */
	PING,
	/**
	 * 心跳响应
	 */
	PONG,
	/**
	 * 关闭
	 */
	CLOSE,
	/**
	 * 权限验证
	 */
	AUTH,
	/**
	 * 认证绑定
	 */
	BIND,
	/**
	 * 长轮询
	 */
	POLL,
	/**
	 * 消息
	 */
	MESSAGE,
	/**
	 * 变更状态
	 */
	CHANGE_STATUS,
	/**
	 * 转接
	 */
	TRANSFER,
	/**
	 * 已转接
	 */
	BUILD_TRANSFER_CHAT,
	/**
	 * 接待
	 */
	RECEPTION,
	/**
	 * 评价
	 */
	EVALUATE,
	/**
	 * 撤回
	 */
	REVOCATION,
	/**
	 * 创建会话
	 */
	BUILD_CHAT,
	/**
	 * 登录重复
	 */
	RE_LOGIN,
	/**
	 * 洽谈中
	 */
	CHATTING,
	/**
	 * 关闭会话
	 */
	CLOSE_CHAT,
	/**
	 * 广播
	 */
	BROADCAST,
	/**
	 * 非工作时间
	 */
	NON_WORKING_TIME;

	PacketType() { }
}