package com.iot.market.rpc.interfaces;

import com.iot.market.rpc.interfaces.util.ResMsg;

/**
 * Created by dawei on 2018/5/15.
 */
public interface RpcJobService {

    String getJob(String group, String name);

    ResMsg<String> removeJob(String group, String name);

    String getJobByGroup(String group);

    ResMsg<String> addBatchPowerJob(String jsonJob);

    ResMsg<String> addTimerJob(String jsonJob);
}
