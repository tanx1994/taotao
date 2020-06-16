package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {
    /**
     * 
     * 表字段 : tb_user.id
     */
    private Long id;

    /**
     * 用户名
     * 表字段 : tb_user.username
     */
    private String username;

    /**
     * 密码，加密存储
     * 表字段 : tb_user.password
     */
    private String password;

    /**
     * 注册手机号
     * 表字段 : tb_user.phone
     */
    private String phone;

    /**
     * 注册邮箱
     * 表字段 : tb_user.email
     */
    private String email;

    /**
     * 
     * 表字段 : tb_user.created
     */
    private Date created;

    /**
     * 
     * 表字段 : tb_user.updated
     */
    private Date updated;

    /**
     * 获取  字段:tb_user.id
     *
     * @return tb_user.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:tb_user.id
     *
     * @param id the value for tb_user.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户名 字段:tb_user.username
     *
     * @return tb_user.username, 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置 用户名 字段:tb_user.username
     *
     * @param username the value for tb_user.username, 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取 密码，加密存储 字段:tb_user.password
     *
     * @return tb_user.password, 密码，加密存储
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码，加密存储 字段:tb_user.password
     *
     * @param password the value for tb_user.password, 密码，加密存储
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取 注册手机号 字段:tb_user.phone
     *
     * @return tb_user.phone, 注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 注册手机号 字段:tb_user.phone
     *
     * @param phone the value for tb_user.phone, 注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取 注册邮箱 字段:tb_user.email
     *
     * @return tb_user.email, 注册邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 注册邮箱 字段:tb_user.email
     *
     * @param email the value for tb_user.email, 注册邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取  字段:tb_user.created
     *
     * @return tb_user.created, 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置  字段:tb_user.created
     *
     * @param created the value for tb_user.created, 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取  字段:tb_user.updated
     *
     * @return tb_user.updated, 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置  字段:tb_user.updated
     *
     * @param updated the value for tb_user.updated, 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}