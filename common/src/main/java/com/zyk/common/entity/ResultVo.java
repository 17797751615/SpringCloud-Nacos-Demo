package com.zyk.common.entity;

import com.zyk.common.enums.ResponseValues;

import java.sql.ResultSet;

/**
 * @author Forrest
 * @Classname ResultVo
 * @Description 所有接口的返回类型。
 * @Date 2020/6/2 13:41
 * @Created by Forrest
 * @Email comeonZYK@outlook.com
 * ┏┛ ┻━━━━━┛ ┻┓
 * ┃　　　　　　 ┃
 * ┃　　　━　　　┃
 * ┃　┳┛　  ┗┳　┃
 * ┃　　　　　　 ┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　 ┃
 * ┗━┓　　　┏━━━┛
 * ┃　　　┃   神兽保佑
 * ┃　　　┃   代码无BUG！
 * ┃　　　┗━━━━━━━━━┓
 * ┃　　　　　　　    ┣┓
 * ┃　　　　         ┏┛
 * ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * ┃ ┫ ┫   ┃ ┫ ┫
 * ┗━┻━┛   ┗━┻━┛
 */
public class ResultVo<T> {
    private String code;
    private String enMessage;
    private String zhMessage;
    private T data;
    public ResultVo (ResponseValues responseValues,T data) {
        this.code = responseValues.getCode();
        this.enMessage = responseValues.getEnMessage();
        this.zhMessage = responseValues.getEnMessage();
        this.data = data;
    }
    public static ResultVo SUCCESS() {
        return new ResultVo(ResponseValues.SUCCESS,null);
    }
    public static ResultVo FAILED() {
        return new ResultVo(ResponseValues.FAILED,null);
    }
    public static ResultVo INFO(ResponseValues responseValues,Object data) {
        return new ResultVo(responseValues,data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnMessage() {
        return enMessage;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }

    public String getZhMessage() {
        return zhMessage;
    }

    public void setZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
