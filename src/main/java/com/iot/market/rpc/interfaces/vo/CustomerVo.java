package com.iot.market.rpc.interfaces.vo;

import java.io.Serializable;

/**
 * Created by lvsheng on 2018/6/14.
 */
public class CustomerVo implements Serializable{

    private static final long serialVersionUID = -366743387104683468L;

    private String number ;

    private String percent;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
