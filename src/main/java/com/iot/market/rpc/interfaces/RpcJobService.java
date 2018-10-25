package com.iot.market.rpc.interfaces;

/**
 * Created by dawei on 2018/5/15.
 */
public interface RpcJobService {

    String getJob(String group, String name);

    Boolean removeJob(String group, String name);

    String getJobByGroup(String group);
}
