package com.oc.message.body;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author chuangyeifang
 */
@Getter
@Setter
@ToString
public class AuthWaiter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tenantCode;
	private Integer teamCode;
	private String waiterName;
	private String waiterCode;
	private String sign;
	
    public AuthWaiter() {}
}