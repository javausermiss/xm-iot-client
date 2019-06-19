package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.DeviceStatusVo;
import com.iot.market.rpc.interfaces.bean.EquMsg;
import com.iot.market.rpc.interfaces.bean.KwhVo;
import com.iot.market.rpc.interfaces.po.ParamConfig;
import com.iot.market.rpc.interfaces.util.ResMsg;
import com.iot.market.rpc.interfaces.vo.AnalysisVo;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by lvsheng on 2019/01/08.
 */
public interface EnergyService {

    /**
     * 能耗情况 今日、本月
     * @param param
     * @return
     */
    ResMsg<Map>  energyAll(EquMsg param) throws ParseException;


    /**
     * 能耗情况 时、天、周、月
     * @param param
     * @return
     */
    ResMsg<Map>  energydetail(EquMsg param,Integer day) throws ParseException;


    /**
     * 电器电量分析 时、天、周、月
     * @param param
     * @return
     */
    ResMsg< List<AnalysisVo>>  analysis(ParamConfig param, Integer day) throws ParseException;


    /**
     * 获取设备能耗同级别占比
     * @param stroreCode
     * @param startTime
     * @param endTime
     * @param modelId
     * @return
     * @throws Exception
     */

    ResMsg<List<KwhVo>>  getDeviceProportion(String stroreCode, String startTime, String endTime, Integer modelId)throws Exception;


    /**
     * 查询出设备一定时间内的功率，电量
     * @param storeCode
     * @param deviceCode
     * @param sTime
     * @param eTime
     * @return
     * @throws Exception
     */
    ResMsg<Map> getstaticskwh(String storeCode, String deviceCode ,String sTime, String eTime,Integer day)throws Exception;

    ResMsg<Map> getstaticsPower(String storeCode, String deviceCode ,String sTime, String eTime)throws Exception;

    /**
     * 查询设备开关状态
     * @param storeCode
     * @param deviceCode
     * @return
     */
    DeviceStatusVo getSwitchStatus(String storeCode,String deviceCode);





}
