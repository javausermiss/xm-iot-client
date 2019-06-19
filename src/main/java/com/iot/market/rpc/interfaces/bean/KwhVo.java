package com.iot.market.rpc.interfaces.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName KwhVo
 * @Description TODO
 * @Author weijunyong
 * @Date 2019/4/8 16:09
 * @Version 1.0
 **/
@Data
public class KwhVo implements Serializable {
    private static final long serialVersionUID = 1L;

    //设备所属模块
    private String deviceModel;

    //设备描述
    private String des;

    //设备名字
    private String deviceName;

    //设备耗电量
    private String kwhValue;

    //耗电量百分比
    private String percentage;


    public KwhVo() {
    }

    public KwhVo(String deviceName, String kwhValue, String percentage) {
        this.deviceName = deviceName;
        this.kwhValue = kwhValue;
        this.percentage = percentage;
    }

    public KwhVo(String deviceModel, String des, String deviceName, String kwhValue, String percentage) {
        this.deviceModel = deviceModel;
        this.des = des;
        this.deviceName = deviceName;
        this.kwhValue = kwhValue;
        this.percentage = percentage;
    }
}
