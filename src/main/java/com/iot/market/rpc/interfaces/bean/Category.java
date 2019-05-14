package com.iot.market.rpc.interfaces.bean;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**分类表
 * @author weijunyong
 * @version 1.0
 * @classname Category
 * @date 2019/5/11 12:16
 **/
@Data
@Table(name = "tb_category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String categoryname;
}
