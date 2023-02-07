package com.report.entity.common;

import lombok.Data;


@Data
public class ReturnResult {
    private int code;
    private Object data;
    private String msg;
    private boolean status;

    public ReturnResult(int code, Object data, String msg,boolean status) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.status = status;
    }

    public static ReturnResult success(Object data,String msg){
        return new ReturnResult(1,data,msg,true);
    }
}
