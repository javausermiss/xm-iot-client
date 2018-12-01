package com.iot.market.rpc.interfaces.service;

import com.iot.market.rpc.interfaces.po.JobDetailPO;
import com.iot.market.rpc.interfaces.util.ResMsg;

import java.util.List;

/**
 * quartz定时任务
 * Created by heyangyang on 2018/12/1.
 */
public interface QuartzJobDubboService {

    /**
     * 查询全部定时任务列表
     * @return
     */
    public ResMsg<List<JobDetailPO>> selectQuartzJobList() throws Exception;

    /**
     * 根据分组查询定时任务列表
     * @param group
     * @return
     */
    public ResMsg<List<JobDetailPO>> selectQuartzJobListByGroup(String group) throws Exception;

    /**
     * 根据分组和名称查询定时任务
     * @param group
     * @param name
     * @return
     */
    public ResMsg<JobDetailPO> selectQuartzJobByGroupAndName(String group,String name) throws Exception;

    /**
     * 添加定时任务
     * @param jobDetailPO
     * @return
     */
    public ResMsg<JobDetailPO> saveQuartzJobInfo(JobDetailPO jobDetailPO) throws Exception;


}
