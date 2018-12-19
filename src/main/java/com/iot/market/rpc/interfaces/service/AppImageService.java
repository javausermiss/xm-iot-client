package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.AppImage;
import com.iot.market.rpc.interfaces.util.ResMsg;
import com.iot.market.rpc.interfaces.vo.StatisticsVo;

import java.util.List;
import java.util.Map;

/**
 * Created by lvsheng on 2018/12/13.
 */
public interface AppImageService {

    /**
     * 获取一级列表
     * @return
     */
    List<AppImage> queryAppImageList(AppImage param,String storeCode) throws Exception;


    /**
     * 查询设备详情图片
     * @return
     */
    AppImage queryAppImage(AppImage param) throws Exception;

    /**
     * 设备统计type: 1_电量统计 2_功率统计  3_温度统计
     * @return
     */
    ResMsg<Map> statistics(StatisticsVo param) throws Exception;


}