package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemDesc implements Serializable {
    /**
     * 商品ID
     * 表字段 : tb_item_desc.item_id
     */
    private Long itemId;

    /**
     * 创建时间
     * 表字段 : tb_item_desc.created
     */
    private Date created;

    /**
     * 更新时间
     * 表字段 : tb_item_desc.updated
     */
    private Date updated;

    /**
     * 商品描述
     * 表字段 : tb_item_desc.item_desc
     */
    private String itemDesc;

    /**
     * 获取 商品ID 字段:tb_item_desc.item_id
     *
     * @return tb_item_desc.item_id, 商品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置 商品ID 字段:tb_item_desc.item_id
     *
     * @param itemId the value for tb_item_desc.item_id, 商品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取 创建时间 字段:tb_item_desc.created
     *
     * @return tb_item_desc.created, 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置 创建时间 字段:tb_item_desc.created
     *
     * @param created the value for tb_item_desc.created, 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 更新时间 字段:tb_item_desc.updated
     *
     * @return tb_item_desc.updated, 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置 更新时间 字段:tb_item_desc.updated
     *
     * @param updated the value for tb_item_desc.updated, 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 商品描述 字段:tb_item_desc.item_desc
     *
     * @return tb_item_desc.item_desc, 商品描述
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置 商品描述 字段:tb_item_desc.item_desc
     *
     * @param itemDesc the value for tb_item_desc.item_desc, 商品描述
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}