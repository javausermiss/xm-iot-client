package com.iot.market.rpc.interfaces.vo;

import java.io.Serializable;

/**
 * Created by lvsheng on 2018/6/14.
 */
public class StatisticsVo implements Serializable{

    private static final long serialVersionUID = -366743387104683468L;

    private String storeCode;

    private String facilityCode;

    private Integer day;

    private Integer type;

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
