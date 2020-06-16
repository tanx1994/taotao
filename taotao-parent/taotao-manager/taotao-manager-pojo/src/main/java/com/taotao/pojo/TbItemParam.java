package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParam implements Serializable {
    /**
     * 
     * 表字段 : tb_item_param.id
     */
    private Long id;

    /**
     * 商品类目ID
     * 表字段 : tb_item_param.item_cat_id
     */
    private Long itemCatId;

    /**
     * 
     * 表字段 : tb_item_param.created
     */
    private Date created;

    /**
     * 
     * 表字段 : tb_item_param.updated
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     * 表字段 : tb_item_param.param_data
     */
    private String paramData;

    /**
     * 获取  字段:tb_item_param.id
     *
     * @return tb_item_param.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:tb_item_param.id
     *
     * @param id the value for tb_item_param.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 商品类目ID 字段:tb_item_param.item_cat_id
     *
     * @return tb_item_param.item_cat_id, 商品类目ID
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * 设置 商品类目ID 字段:tb_item_param.item_cat_id
     *
     * @param itemCatId the value for tb_item_param.item_cat_id, 商品类目ID
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * 获取  字段:tb_item_param.created
     *
     * @return tb_item_param.created, 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置  字段:tb_item_param.created
     *
     * @param created the value for tb_item_param.created, 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取  字段:tb_item_param.updated
     *
     * @return tb_item_param.updated, 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置  字段:tb_item_param.updated
     *
     * @param updated the value for tb_item_param.updated, 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 参数数据，格式为json格式 字段:tb_item_param.param_data
     *
     * @return tb_item_param.param_data, 参数数据，格式为json格式
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 设置 参数数据，格式为json格式 字段:tb_item_param.param_data
     *
     * @param paramData the value for tb_item_param.param_data, 参数数据，格式为json格式
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}