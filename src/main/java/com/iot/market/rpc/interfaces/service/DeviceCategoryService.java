package com.iot.market.rpc.interfaces.service;

import com.iot.market.rpc.interfaces.bean.Category;
import com.iot.market.rpc.interfaces.bean.Instant;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * @ClassName DeviceCategoryService
 * @Description TODO
 * @Author weijunyong
 * @Date 2019/5/13 15:31
 * @Version 1.0
 **/
public interface DeviceCategoryService {
    /**
     * 获取设备分类
     * @return
     */
    ResMsg<List<Category>> getDeviceCategory();


    ResMsg<List<Instant>> getCategoryDevice(String storeCode, Integer code);
}
