package com.iot.market.rpc.interfaces;

import com.iot.market.rpc.interfaces.util.ResMsg;

/**
 * Created by dawei on 2018/5/15.
 */
public interface RpcJobService {

    /**
     * 获取定时器
     */
    String getJob(String group, String name);

    /**
     * 删除定时器
     */
    ResMsg<String> removeJob(String group, String name);

    /**
     * 根据分组获取定时器
     */
    String getJobByGroup(String group);

    /**
     * 添加批处理定时器
     */
    ResMsg<String> addBatchPowerJob(String jsonJob);

    /**
     * 添加普通类定时器
     */
    ResMsg<String> addNormalJob(String jsonJob);

    /**
     * 添加倒计时定时器
     */
    ResMsg<String> addTimerJob(String jsonJob);

    ResMsg<String> switchJob(String group, String name, Boolean enable);

    ResMsg<String> addTrigger(String jobGroup, String jobName, String jsonTrigger);

    ResMsg<String> deleteTrigger(String triggerGroup, String triggerName);

    /**
     * 定时器开关
     */
    ResMsg<String> switchTrigger(String triggerGroup, String triggerName, Boolean enable);

    ResMsg<String> getTriggerByKey(String jobGroup, String jobName);
}
