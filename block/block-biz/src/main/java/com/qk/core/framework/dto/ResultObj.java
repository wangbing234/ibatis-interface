package com.qk.core.framework.dto;

/**
 * 结果对象
 * @author bing.wang
 *
 */
public class ResultObj {
	 // 构造方法  
	public ResultObj(String code, String msg) {
        this.code = code;  
        this.msg = msg;  
    }  
    // 构造方法  
    public ResultObj(ResultEnum re) {
        this.code = re.getCode();  
        this.msg = re.getMsg();  
    }  
	private String code;
	private Object data;
	private String msg;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public ResultObj setData(Object data) {
		this.data = data;
		return this;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String toString(){
		return code;
		
	}
	
}
