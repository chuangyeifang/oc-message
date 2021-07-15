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
public enum BodyType {

	/**
	 * 登录认证内容
	 */
	LOGIN,
	/**
	 * 登录认证机制交互
	 */
	RESPONSE,
	/**
	 * 中断请求
	 */
	ABORT,
	/**
	 * 文本内容
	 */
	TEXT,
	/**
	 * 图片地址内容
	 */
	IMAGE,
	/**
	 * 订单信息
	 */
	ORDER,
	/**
	 * 商品信息
	 */
	GOODS,
	/**
	 * 物流信息
	 */
	LOGISTICS,
	/**
	 * 正在分配客服中
	 */
	BUILDING_CHAT,
	/**
	 * 团队欢迎语
	 */
	TEAM_GREET,
	/**
	 * 客服欢迎语
	 */
	WAITER_GREET,
	/**
	 * 超时提示
	 */
	TIMEOUT_TIP,
	/**
	 * 超时关闭
	 */
	TIMEOUT_CLOSE,
	/**
	 * 按客服转接
	 */
	TRANSFER_WAITER,
	/**
	 * 按团队转接
	 */
	TRANSFER_TEAM,
	/**
	 * 排队编号
	 */
	WAITTING_NO,
	/**
	 * 排队中
	 */
	WAITTING,
	/**
	 * 客服关闭
	 */
	WAITER_CLOSE,
	/**
	 * 客戶关闭
	 */
	CUSTOMER_CLOSE,
	/**
	 * 机器人
	 */
	ROBOT,
	/**
	 * 提示信息，不入库
	 */
	TIP,
	/**
	 * 成功
	 */
	SUCCESS,
	/**
	 * 失敗
	 */
	FAIL;

	BodyType() {}
}