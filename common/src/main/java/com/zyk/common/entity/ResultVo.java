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
public class ResultVo {
    private String code;
    private String message;
    private Object data;
    public ResultVo (ResponseValues responseValues,Object data) {
        this.code = responseValues.getCode();
        this.message = responseValues.getMessage();
        this.data = data;
    }
    public static ResultVo SUCCESS() {
        return new ResultVo(ResponseValues.SUCCESS,null);
    }
    public static ResultVo FAILED() {
        return new ResultVo(ResponseValues.FAILED,null);
    }
}
