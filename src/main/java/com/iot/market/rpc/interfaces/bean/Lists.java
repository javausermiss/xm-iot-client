package com.iot.market.rpc.interfaces.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author weijunyong
 * @version 1.0
 * @classname Lists
 * @date 2019/5/27 10:22
 **/
@Data
public class Lists implements Serializable {
    List<String> list;
}
