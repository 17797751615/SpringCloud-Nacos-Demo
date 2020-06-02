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
        System.out.println(code+"  "+message);
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
    // 一  获取基本信息（门店信息，进店时间，姓名）
    //     1 定义变量 roomName， inTime ，name
    //     2 接口有返回值后将值赋给roomName， inTime ，name
    // 二 获取问卷信息
    //     1 定义变量（问题，总数，当前数初始化1，答案数组，  选择结果集 用于保存选择结果，下一题是否展示的变量，
    //     上一题是否展示的变量，提交是否展示的变量）
    //     2 根据接口返回数据 初始化 总数，问题 答案数组。
    //     3 点击下一题时 保存选择结果到结果集。更新 当前问题下标，根据下标重新展示问题，答案。
    //     4 点击提交 将答案提交给后台。
}
