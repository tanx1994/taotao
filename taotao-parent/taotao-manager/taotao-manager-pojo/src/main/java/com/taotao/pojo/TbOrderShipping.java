package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbOrderShipping implements Serializable {
    /**
     * 订单ID
     * 表字段 : tb_order_shipping.order_id
     */
    private String orderId;

    /**
     * 收货人全名
     * 表字段 : tb_order_shipping.receiver_name
     */
    private String receiverName;

    /**
     * 固定电话
     * 表字段 : tb_order_shipping.receiver_phone
     */
    private String receiverPhone;

    /**
     * 移动电话
     * 表字段 : tb_order_shipping.receiver_mobile
     */
    private String receiverMobile;

    /**
     * 省份
     * 表字段 : tb_order_shipping.receiver_state
     */
    private String receiverState;

    /**
     * 城市
     * 表字段 : tb_order_shipping.receiver_city
     */
    private String receiverCity;

    /**
     * 区/县
     * 表字段 : tb_order_shipping.receiver_district
     */
    private String receiverDistrict;

    /**
     * 收货地址，如：xx路xx号
     * 表字段 : tb_order_shipping.receiver_address
     */
    private String receiverAddress;

    /**
     * 邮政编码,如：310001
     * 表字段 : tb_order_shipping.receiver_zip
     */
    private String receiverZip;

    /**
     * 
     * 表字段 : tb_order_shipping.created
     */
    private Date created;

    /**
     * 
     * 表字段 : tb_order_shipping.updated
     */
    private Date updated;

    /**
     * 获取 订单ID 字段:tb_order_shipping.order_id
     *
     * @return tb_order_shipping.order_id, 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置 订单ID 字段:tb_order_shipping.order_id
     *
     * @param orderId the value for tb_order_shipping.order_id, 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 获取 收货人全名 字段:tb_order_shipping.receiver_name
     *
     * @return tb_order_shipping.receiver_name, 收货人全名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置 收货人全名 字段:tb_order_shipping.receiver_name
     *
     * @param receiverName the value for tb_order_shipping.receiver_name, 收货人全名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取 固定电话 字段:tb_order_shipping.receiver_phone
     *
     * @return tb_order_shipping.receiver_phone, 固定电话
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置 固定电话 字段:tb_order_shipping.receiver_phone
     *
     * @param receiverPhone the value for tb_order_shipping.receiver_phone, 固定电话
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * 获取 移动电话 字段:tb_order_shipping.receiver_mobile
     *
     * @return tb_order_shipping.receiver_mobile, 移动电话
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置 移动电话 字段:tb_order_shipping.receiver_mobile
     *
     * @param receiverMobile the value for tb_order_shipping.receiver_mobile, 移动电话
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 获取 省份 字段:tb_order_shipping.receiver_state
     *
     * @return tb_order_shipping.receiver_state, 省份
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * 设置 省份 字段:tb_order_shipping.receiver_state
     *
     * @param receiverState the value for tb_order_shipping.receiver_state, 省份
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState == null ? null : receiverState.trim();
    }

    /**
     * 获取 城市 字段:tb_order_shipping.receiver_city
     *
     * @return tb_order_shipping.receiver_city, 城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置 城市 字段:tb_order_shipping.receiver_city
     *
     * @param receiverCity the value for tb_order_shipping.receiver_city, 城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    /**
     * 获取 区/县 字段:tb_order_shipping.receiver_district
     *
     * @return tb_order_shipping.receiver_district, 区/县
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * 设置 区/县 字段:tb_order_shipping.receiver_district
     *
     * @param receiverDistrict the value for tb_order_shipping.receiver_district, 区/县
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict == null ? null : receiverDistrict.trim();
    }

    /**
     * 获取 收货地址，如：xx路xx号 字段:tb_order_shipping.receiver_address
     *
     * @return tb_order_shipping.receiver_address, 收货地址，如：xx路xx号
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置 收货地址，如：xx路xx号 字段:tb_order_shipping.receiver_address
     *
     * @param receiverAddress the value for tb_order_shipping.receiver_address, 收货地址，如：xx路xx号
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 获取 邮政编码,如：310001 字段:tb_order_shipping.receiver_zip
     *
     * @return tb_order_shipping.receiver_zip, 邮政编码,如：310001
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * 设置 邮政编码,如：310001 字段:tb_order_shipping.receiver_zip
     *
     * @param receiverZip the value for tb_order_shipping.receiver_zip, 邮政编码,如：310001
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    /**
     * 获取  字段:tb_order_shipping.created
     *
     * @return tb_order_shipping.created, 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置  字段:tb_order_shipping.created
     *
     * @param created the value for tb_order_shipping.created, 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取  字段:tb_order_shipping.updated
     *
     * @return tb_order_shipping.updated, 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置  字段:tb_order_shipping.updated
     *
     * @param updated the value for tb_order_shipping.updated, 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}