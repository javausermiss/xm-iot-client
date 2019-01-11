package com.iot.market.rpc.interfaces.service;


import com.github.pagehelper.PageInfo;
import com.iot.market.rpc.interfaces.bean.EquMsg;
import com.iot.market.rpc.interfaces.bean.VoiceConfig;
import com.iot.market.rpc.interfaces.po.User;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by lvsheng on 2019/01/08.
 */
public interface VoiceService {

    /**
     * 查询列表
     * @return
     */
    List<VoiceConfig> queyrparam(VoiceConfig param) throws Exception;


    /**
     * 修改语音
     * @return
     */
    ResMsg<String> addparam(VoiceConfig param, User user) throws Exception;

}