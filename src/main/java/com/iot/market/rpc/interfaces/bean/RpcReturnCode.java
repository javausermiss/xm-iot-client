package com.iot.market.rpc.interfaces.bean;

/**
 * @author david
 * @date 2015年8月25日 下午3:03:56
 */
public enum RpcReturnCode {

    // 成功
    SUCCESS("SUCCESS"),

    // 请求失败
    FAILED("FAILED");

    private String value;

    RpcReturnCode(String value) {
        this.value = value;
    }

    public static RpcReturnCode getTypeByValue(String value) {
        for (RpcReturnCode type : RpcReturnCode.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}
