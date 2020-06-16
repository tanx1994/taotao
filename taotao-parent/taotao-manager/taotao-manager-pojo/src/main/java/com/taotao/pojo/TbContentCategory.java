package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbContentCategory implements Serializable {
    /**
     * 类目ID
     * 表字段 : tb_content_category.id
     */
    private Long id;

    /**
     * 父类目ID=0时，代表的是一级的类目
     * 表字段 : tb_content_category.parent_id
     */
    private Long parentId;

    /**
     * 分类名称
     * 表字段 : tb_content_category.name
     */
    private String name;

    /**
     * 状态。可选值:1(正常),2(删除)
     * 表字段 : tb_content_category.status
     */
    private Integer status;

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     * 表字段 : tb_content_category.sort_order
     */
    private Integer sortOrder;

    /**
     * 该类目是否为父类目，1为true，0为false
     * 表字段 : tb_content_category.is_parent
     */
    private Boolean isParent;

    /**
     * 创建时间
     * 表字段 : tb_content_category.created
     */
    private Date created;

    /**
     * 创建时间
     * 表字段 : tb_content_category.updated
     */
    private Date updated;

    /**
     * 获取 类目ID 字段:tb_content_category.id
     *
     * @return tb_content_category.id, 类目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 类目ID 字段:tb_content_category.id
     *
     * @param id the value for tb_content_category.id, 类目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 父类目ID=0时，代表的是一级的类目 字段:tb_content_category.parent_id
     *
     * @return tb_content_category.parent_id, 父类目ID=0时，代表的是一级的类目
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 父类目ID=0时，代表的是一级的类目 字段:tb_content_category.parent_id
     *
     * @param parentId the value for tb_content_category.parent_id, 父类目ID=0时，代表的是一级的类目
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 分类名称 字段:tb_content_category.name
     *
     * @return tb_content_category.name, 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 分类名称 字段:tb_content_category.name
     *
     * @param name the value for tb_content_category.name, 分类名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取 状态。可选值:1(正常),2(删除) 字段:tb_content_category.status
     *
     * @return tb_content_category.status, 状态。可选值:1(正常),2(删除)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 状态。可选值:1(正常),2(删除) 字段:tb_content_category.status
     *
     * @param status the value for tb_content_category.status, 状态。可选值:1(正常),2(删除)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数 字段:tb_content_category.sort_order
     *
     * @return tb_content_category.sort_order, 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 设置 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数 字段:tb_content_category.sort_order
     *
     * @param sortOrder the value for tb_content_category.sort_order, 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 获取 该类目是否为父类目，1为true，0为false 字段:tb_content_category.is_parent
     *
     * @return tb_content_category.is_parent, 该类目是否为父类目，1为true，0为false
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * 设置 该类目是否为父类目，1为true，0为false 字段:tb_content_category.is_parent
     *
     * @param isParent the value for tb_content_category.is_parent, 该类目是否为父类目，1为true，0为false
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取 创建时间 字段:tb_content_category.created
     *
     * @return tb_content_category.created, 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置 创建时间 字段:tb_content_category.created
     *
     * @param created the value for tb_content_category.created, 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 创建时间 字段:tb_content_category.updated
     *
     * @return tb_content_category.updated, 创建时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置 创建时间 字段:tb_content_category.updated
     *
     * @param updated the value for tb_content_category.updated, 创建时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}