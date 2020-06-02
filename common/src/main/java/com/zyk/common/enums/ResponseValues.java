package com.zyk.common.enums;

/**
 * @author Think
 * @Classname ResponseValues
 * @Description 返回值的枚举类型
 * @Date 2020/6/2 11:23
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
public enum ResponseValues {
    /**
     *
     */
    SUCCESS("200","请求成功"),
    /**
     *
     */
    FAILED("500","服务器内部异常"),
    /**
     *
     */
    WAIT("300","请等待");

    /**
     *
     * @param code 返回值code
     * @param message 返回信息
     */
    ResponseValues(String code, String message) {
        this.code = code;
        this.message = message;
    }
    private String code;
    private String message;

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
}
