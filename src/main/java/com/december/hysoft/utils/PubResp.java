package com.december.hysoft.utils;

/**
 * Created by Administrator on 2018/12/13.
 */
public enum PubResp {

    SUCCESS(200, "成功"),
    WARN(400, "网络异常，请稍后重试"),
    ERROR(500, "网络异常，请稍后重试");

    private int code;
    private String msg;

    PubResp(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
