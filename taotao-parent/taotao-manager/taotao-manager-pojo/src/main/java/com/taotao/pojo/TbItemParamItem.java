package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParamItem implements Serializable {
    /**
     * 
     * 表字段 : tb_item_param_item.id
     */
    private Long id;

    /**
     * 商品ID
     * 表字段 : tb_item_param_item.item_id
     */
    private Long itemId;

    /**
     * 
     * 表字段 : tb_item_param_item.created
     */
    private Date created;

    /**
     * 
     * 表字段 : tb_item_param_item.updated
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     * 表字段 : tb_item_param_item.param_data
     */
    private String paramData;

    /**
     * 获取  字段:tb_item_param_item.id
     *
     * @return tb_item_param_item.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:tb_item_param_item.id
     *
     * @param id the value for tb_item_param_item.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 商品ID 字段:tb_item_param_item.item_id
     *
     * @return tb_item_param_item.item_id, 商品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置 商品ID 字段:tb_item_param_item.item_id
     *
     * @param itemId the value for tb_item_param_item.item_id, 商品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取  字段:tb_item_param_item.created
     *
     * @return tb_item_param_item.created, 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置  字段:tb_item_param_item.created
     *
     * @param created the value for tb_item_param_item.created, 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取  字段:tb_item_param_item.updated
     *
     * @return tb_item_param_item.updated, 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置  字段:tb_item_param_item.updated
     *
     * @param updated the value for tb_item_param_item.updated, 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 参数数据，格式为json格式 字段:tb_item_param_item.param_data
     *
     * @return tb_item_param_item.param_data, 参数数据，格式为json格式
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 设置 参数数据，格式为json格式 字段:tb_item_param_item.param_data
     *
     * @param paramData the value for tb_item_param_item.param_data, 参数数据，格式为json格式
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}