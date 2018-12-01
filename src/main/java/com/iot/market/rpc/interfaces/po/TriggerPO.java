package com.iot.market.rpc.interfaces.po;

import java.io.Serializable;
import java.text.ParseException;

/**
 * 定时任务触发器
 * Created by heyangyang on 2018/11/29.
 */
public class TriggerPO implements Serializable{

    private static final long serialVersionUID = 2511223272520391529L;
    private String name;
    private String group;
    private String cronExpression;
    private String description;
    private String triggerState;
    private String addr;
    private String value;
    private String commandType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TriggerDO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", group='").append(group).append('\'');
        sb.append(", cronExpression='").append(cronExpression).append('\'');
        sb.append(", triggerState='").append(triggerState).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
