package com.iot.market.rpc.interfaces.po;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * 封装定时任务
 * Created by heyangyang on 2018/11/29.
 */
public class JobDetailPO {

    private JobPO jobPO;

    // trigger info
    private Set<TriggerPO> triggerPOs;

    public JobPO getJobPO() {
        return jobPO;
    }

    public void setJobPO(JobPO jobPO) {
        this.jobPO = jobPO;
    }

    public Set<TriggerPO> getTriggerPOs() {
        return triggerPOs;
    }

    public void setTriggerPOs(Set<TriggerPO> triggerPOs) {
        this.triggerPOs = triggerPOs;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }


}
