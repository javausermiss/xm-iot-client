package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 情景模式
 */
@Table(name = "contextual_model")
public class ContextualModel implements Serializable{
    private static final long serialVersionUID = 6736457239453512995L;

    public ContextualModel(){}

    public ContextualModel(Integer id){
        this.id = id;
    }

    public ContextualModel(String storeCode, Integer unmanned, Integer abnormal){
        this.storeCode = storeCode;
        this.unmanned = unmanned;
        this.abnormal = abnormal;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "store_code")
    private String storeCode;

    private Integer night;

    private Integer air;

    private Integer lighting;

    private Integer abnormal;

    private Integer unmanned;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    public Integer getNight() {
        return night;
    }

    public void setNight(Integer night) {
        this.night = night;
    }

    public Integer getAir() {
        return air;
    }

    public void setAir(Integer air) {
        this.air = air;
    }

    public Integer getLighting() {
        return lighting;
    }

    public void setLighting(Integer lighting) {
        this.lighting = lighting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Integer getUnmanned() {
        return unmanned;
    }

    public void setUnmanned(Integer unmanned) {
        this.unmanned = unmanned;
    }

    public Integer getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(Integer abnormal) {
        this.abnormal = abnormal;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }
}