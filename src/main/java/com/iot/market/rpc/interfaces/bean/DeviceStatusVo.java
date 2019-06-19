package com.iot.market.rpc.interfaces.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author weijunyong
 * @version 1.0
 * @classname DeviceStatusVo
 * @date 2019/5/25 14:55
 **/
@Data
public class DeviceStatusVo implements Serializable {

    private String deviceCode;

    private String switchStatus;
}
