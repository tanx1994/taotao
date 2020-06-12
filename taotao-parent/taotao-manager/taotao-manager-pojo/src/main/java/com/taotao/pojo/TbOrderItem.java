package com.taotao.pojo;

public class TbOrderItem {
    /**
     * 
     * 表字段 : tb_order_item.id
     */
    private String id;

    /**
     * 商品id
     * 表字段 : tb_order_item.item_id
     */
    private String itemId;

    /**
     * 订单id
     * 表字段 : tb_order_item.order_id
     */
    private String orderId;

    /**
     * 商品购买数量
     * 表字段 : tb_order_item.num
     */
    private Integer num;

    /**
     * 商品标题
     * 表字段 : tb_order_item.title
     */
    private String title;

    /**
     * 商品单价
     * 表字段 : tb_order_item.price
     */
    private Long price;

    /**
     * 商品总金额
     * 表字段 : tb_order_item.total_fee
     */
    private Long totalFee;

    /**
     * 商品图片地址
     * 表字段 : tb_order_item.pic_path
     */
    private String picPath;

    /**
     * 获取  字段:tb_order_item.id
     *
     * @return tb_order_item.id, 
     */
    public String getId() {
        return id;
    }

    /**
     * 设置  字段:tb_order_item.id
     *
     * @param id the value for tb_order_item.id, 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取 商品id 字段:tb_order_item.item_id
     *
     * @return tb_order_item.item_id, 商品id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置 商品id 字段:tb_order_item.item_id
     *
     * @param itemId the value for tb_order_item.item_id, 商品id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取 订单id 字段:tb_order_item.order_id
     *
     * @return tb_order_item.order_id, 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置 订单id 字段:tb_order_item.order_id
     *
     * @param orderId the value for tb_order_item.order_id, 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取 商品购买数量 字段:tb_order_item.num
     *
     * @return tb_order_item.num, 商品购买数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置 商品购买数量 字段:tb_order_item.num
     *
     * @param num the value for tb_order_item.num, 商品购买数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取 商品标题 字段:tb_order_item.title
     *
     * @return tb_order_item.title, 商品标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置 商品标题 字段:tb_order_item.title
     *
     * @param title the value for tb_order_item.title, 商品标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取 商品单价 字段:tb_order_item.price
     *
     * @return tb_order_item.price, 商品单价
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置 商品单价 字段:tb_order_item.price
     *
     * @param price the value for tb_order_item.price, 商品单价
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取 商品总金额 字段:tb_order_item.total_fee
     *
     * @return tb_order_item.total_fee, 商品总金额
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 设置 商品总金额 字段:tb_order_item.total_fee
     *
     * @param totalFee the value for tb_order_item.total_fee, 商品总金额
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取 商品图片地址 字段:tb_order_item.pic_path
     *
     * @return tb_order_item.pic_path, 商品图片地址
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 设置 商品图片地址 字段:tb_order_item.pic_path
     *
     * @param picPath the value for tb_order_item.pic_path, 商品图片地址
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}