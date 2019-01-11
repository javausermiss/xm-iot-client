package com.iot.market.rpc.interfaces.service;


import com.iot.market.rpc.interfaces.bean.EquMsg;
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


}