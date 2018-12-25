package com.december.hysoft.utils;

/**
 * Created by Administrator on 2018/12/13.
 */
public class RespEntity {
    private int status;
    private String message;
    private Object data;

    public RespEntity(PubResp resp){
        this.status = resp.getCode();
        this.message = resp.getMsg();
    }

    public RespEntity(PubResp resp,Object data){
        this(resp);
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
}
