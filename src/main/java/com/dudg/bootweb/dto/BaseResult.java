package com.dudg.bootweb.dto;

public class BaseResult<T> {

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    private int code;
    private String msg;
    private T data;

    public BaseResult(T data) {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    public BaseResult(String msg, T data) {
        this.msg = msg;
        this.data = data;
        this.code=200;
    }

    public BaseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
