package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 冷藏业务
 */
@Table(name = "coldstorage")
public class Coldstorage implements Serializable{

    private static final long serialVersionUID = 5884953452469224288L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "facility_code")
    private String facilityCode;

    private String name;

    @Column(name = "store_code")
    private String storeCode;

    private String des;

    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;

    private List<Coldstorage> list;

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Coldstorage> getList() {
        return list;
    }

    public void setList(List<Coldstorage> list) {
        this.list = list;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
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