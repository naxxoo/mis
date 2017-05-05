/**
 * 
 */
package com.ks.mis.model;

import java.io.Serializable;

/**
 * 返回结果模型
 * @author c1panx
 * 2014-11-11  上午10:29:12
 */
public class ResultObject implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String SUCCESS = "0";
	public static final String ERROR = "1";
	
	private String code;
	private String message;
	private Object data;
	
	public ResultObject() {
	}
	
	public ResultObject(String message) {
		this.message = message;
	}

	public ResultObject(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public ResultObject(String code, String message,Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public boolean isSucceed() {
		return SUCCESS.equals(this.code);
	}

}
