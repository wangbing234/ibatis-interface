package com.qk.core.framework;

import com.qk.core.framework.dto.ResultEnum;
import com.qk.core.framework.dto.ResultObj;

public class BaseController {
	
	protected ResultObj success(Object data){
		return new ResultObj(ResultEnum.SUCCESS).setData(data);
	}
	protected ResultObj success(){
		return new ResultObj(ResultEnum.SUCCESS);
	}
}
