package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItem implements Serializable {
    /**
     * 商品id，同时也是商品编号
     * 表字段 : tb_item.id
     */
    private Long id;

    /**
     * 商品标题
     * 表字段 : tb_item.title
     */
    private String title;

    /**
     * 商品卖点
     * 表字段 : tb_item.sell_point
     */
    private String sellPoint;

    /**
     * 商品价格，单位为：分
     * 表字段 : tb_item.price
     */
    private Long price;

    /**
     * 库存数量
     * 表字段 : tb_item.num
     */
    private Integer num;

    /**
     * 商品条形码
     * 表字段 : tb_item.barcode
     */
    private String barcode;

    /**
     * 商品图片
     * 表字段 : tb_item.image
     */
    private String image;

    /**
     * 所属类目，叶子类目
     * 表字段 : tb_item.cid
     */
    private Long cid;

    /**
     * 商品状态，1-正常，2-下架，3-删除
     * 表字段 : tb_item.status
     */
    private Byte status;

    /**
     * 创建时间
     * 表字段 : tb_item.created
     */
    private Date created;

    /**
     * 更新时间
     * 表字段 : tb_item.updated
     */
    private Date updated;

    /**
     * 获取 商品id，同时也是商品编号 字段:tb_item.id
     *
     * @return tb_item.id, 商品id，同时也是商品编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 商品id，同时也是商品编号 字段:tb_item.id
     *
     * @param id the value for tb_item.id, 商品id，同时也是商品编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 商品标题 字段:tb_item.title
     *
     * @return tb_item.title, 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 商品标题 字段:tb_item.title
     *
     * @param title the value for tb_item.title, 商品标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 商品卖点 字段:tb_item.sell_point
     *
     * @return tb_item.sell_point, 商品卖点
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * 设置 商品卖点 字段:tb_item.sell_point
     *
     * @param sellPoint the value for tb_item.sell_point, 商品卖点
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    /**
     * 获取 商品价格，单位为：分 字段:tb_item.price
     *
     * @return tb_item.price, 商品价格，单位为：分
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置 商品价格，单位为：分 字段:tb_item.price
     *
     * @param price the value for tb_item.price, 商品价格，单位为：分
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取 库存数量 字段:tb_item.num
     *
     * @return tb_item.num, 库存数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置 库存数量 字段:tb_item.num
     *
     * @param num the value for tb_item.num, 库存数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取 商品条形码 字段:tb_item.barcode
     *
     * @return tb_item.barcode, 商品条形码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * 设置 商品条形码 字段:tb_item.barcode
     *
     * @param barcode the value for tb_item.barcode, 商品条形码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * 获取 商品图片 字段:tb_item.image
     *
     * @return tb_item.image, 商品图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置 商品图片 字段:tb_item.image
     *
     * @param image the value for tb_item.image, 商品图片
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * 获取 所属类目，叶子类目 字段:tb_item.cid
     *
     * @return tb_item.cid, 所属类目，叶子类目
     */
    public Long getCid() {
        return cid;
    }

    /**
     * 设置 所属类目，叶子类目 字段:tb_item.cid
     *
     * @param cid the value for tb_item.cid, 所属类目，叶子类目
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * 获取 商品状态，1-正常，2-下架，3-删除 字段:tb_item.status
     *
     * @return tb_item.status, 商品状态，1-正常，2-下架，3-删除
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置 商品状态，1-正常，2-下架，3-删除 字段:tb_item.status
     *
     * @param status the value for tb_item.status, 商品状态，1-正常，2-下架，3-删除
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取 创建时间 字段:tb_item.created
     *
     * @return tb_item.created, 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置 创建时间 字段:tb_item.created
     *
     * @param created the value for tb_item.created, 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取 更新时间 字段:tb_item.updated
     *
     * @return tb_item.updated, 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置 更新时间 字段:tb_item.updated
     *
     * @param updated the value for tb_item.updated, 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}