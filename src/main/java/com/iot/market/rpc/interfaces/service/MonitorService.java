package com.iot.market.rpc.interfaces.service;


import com.github.pagehelper.PageInfo;
import com.iot.market.rpc.interfaces.bean.EquMsg;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by lvsheng on 2019/01/08.
 */
public interface MonitorService {

    /**
     * 监控消息
     * @param param
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Map<String, List<EquMsg>>> selectPageListMonitor(Integer pageNum, Integer pageSize, EquMsg param) throws ParseException;


}