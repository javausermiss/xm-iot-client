package com.iot.market.rpc.interfaces.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 门店用户
 */
@Table(name = "store_user")
public class StoreUser implements Serializable{
    private static final long serialVersionUID = 6736457239453512995L;

    public StoreUser(){}

    public StoreUser(Integer id){
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "store_code")
    private String storeCode;

    @Column(name = "user_id")
    private Integer userId;


    private String creator;

    private String updator;

    private String created;

    private String updated;

    private Integer yn;



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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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