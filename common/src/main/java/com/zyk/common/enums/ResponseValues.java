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
 *   ┃　　　┃   神兽保佑
 *   ┃　　　┃   代码无BUG！
 *   ┃　　　┗━━━━━━━━━┓
 *   ┃　　　　　　　    ┣┓
 *   ┃　　　　         ┏┛
 *   ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 *     ┃ ┫ ┫   ┃ ┫ ┫
 *     ┗━┻━┛   ┗━┻━┛
 */
public enum ResponseValues {
    /**
     *
     */
    SUCCESS("200","请求成功","request success"),
    NO_PERSON("401","查无此人","no person"),
    /**
     *
     */
    FAILED("500","服务器内部异常","Server internal exception");

    /**
     *
     * @param code 返回值code
     * @param zhMessage 返回中文信息
     * @param enMessage 返回英文信息
     */
    ResponseValues(String code, String zhMessage,String enMessage) {
        this.code = code;
        this.enMessage = enMessage;
        this.zhMessage = zhMessage;
    }
    private String code;
    private String zhMessage;
    private String enMessage;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZhMessage() {
        return zhMessage;
    }

    public void setZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
    }

    public String getEnMessage() {
        return enMessage;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }
}
