package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.AppImage;
import com.iot.market.rpc.interfaces.bean.Instant;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * Created by lvsheng on 2018/12/13.
 */
public interface AppImageService {

    /**
     * 获取一级列表
     * @return
     */
    List<AppImage> queyrAppImageList(AppImage param) throws Exception;


    /**
     * 查询设备详情图片
     * @return
     */
    AppImage queyrAppImage(AppImage param) throws Exception;


}