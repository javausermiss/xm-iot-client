package com.iot.market.rpc.interfaces.vo;

import java.io.Serializable;

/**
 * Created by lvsheng on 2018/6/14.
 */
public class AnalysisVo implements Serializable{

    private static final long serialVersionUID = -366743387104683468L;
    private String name;

    private String c;

    private String percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
}
