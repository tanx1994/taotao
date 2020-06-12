package com.taotao.pojo;

import java.util.Date;

public class TbContent {
    /**
     * 
     * 表字段 : tb_content.id
     */
    private Long id;

    /**
     * 内容类目ID
     * 表字段 : tb_content.category_id
     */
    private Long categoryId;

    /**
     * 内容标题
     * 表字段 : tb_content.title
     */
    private String title;

    /**
     * 子标题
     * 表字段 : tb_content.sub_title
     */
    private String subTitle;

    /**
     * 标题描述
     * 表字段 : tb_content.title_desc
     */
    private String titleDesc;

    /**
     * 链接
     * 表字段 : tb_content.url
     */
    private String url;

    /**
     * 图片绝对路径
     * 表字段 : tb_content.pic
     */
    private String pic;

    /**
     * 图片2
     * 表字段 : tb_content.pic2
     */
    private String pic2;

    /**
     * 
     * 表字段 : tb_content.created
     */
    private Date created;

    /**
     * 
     * 表字段 : tb_content.updated
     */
    private Date updated;

    /**
     * 内容
     * 表字段 : tb_content.content
     */
    private String content;

    /**
     * 获取  字段:tb_content.id
     *
     * @return tb_content.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:tb_content.id
     *
     * @param id the value for tb_content.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 内容类目ID 字段:tb_content.category_id
     *
     * @return tb_content.category_id, 内容类目ID
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置 内容类目ID 字段:tb_content.category_id
     *
     * @param categoryId the value for tb_content.category_id, 内容类目ID
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取 内容标题 字段:tb_content.title
     *
     * @return tb_content.title, 内容标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 内容标题 字段:tb_content.title
     *
     * @param title the value for tb_content.title, 内容标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 子标题 字段:tb_content.sub_title
     *
     * @return tb_content.sub_title, 子标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 设置 子标题 字段:tb_content.sub_title
     *
     * @param subTitle the value for tb_content.sub_title, 子标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 获取 标题描述 字段:tb_content.title_desc
     *
     * @return tb_content.title_desc, 标题描述
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * 设置 标题描述 字段:tb_content.title_desc
     *
     * @param titleDesc the value for tb_content.title_desc, 标题描述
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    /**
     * 获取 链接 字段:tb_content.url
     *
     * @return tb_content.url, 链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 链接 字段:tb_content.url
     *
     * @param url the value for tb_content.url, 链接
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取 图片绝对路径 字段:tb_content.pic
     *
     * @return tb_content.pic, 图片绝对路径
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置 图片绝对路径 字段:tb_content.pic
     *
     * @param pic the value for tb_content.pic, 图片绝对路径
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 获取 图片2 字段:tb_content.pic2
     *
     * @return tb_content.pic2, 图片2
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * 设置 图片2 字段:tb_content.pic2
     *
     * @param pic2 the value for tb_content.pic2, 图片2
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    /**
     * 获取  字段:tb_content.created
     *
     * @return tb_content.created, 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置  字段:tb_content.created
     *
     * @param created the value for tb_content.created, 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取  字段:tb_content.updated
     *
     * @return tb_content.updated, 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置  字段:tb_content.updated
     *
     * @param updated the value for tb_content.updated, 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 内容 字段:tb_content.content
     *
     * @return tb_content.content, 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置 内容 字段:tb_content.content
     *
     * @param content the value for tb_content.content, 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}