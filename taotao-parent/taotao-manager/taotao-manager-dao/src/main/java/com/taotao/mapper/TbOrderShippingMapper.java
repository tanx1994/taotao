package com.taotao.mapper;

import com.taotao.pojo.TbOrderShipping;
import com.taotao.pojo.TbOrderShippingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderShippingMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_order_shipping
     *
     * @param example
     */
    long countByExample(TbOrderShippingExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_order_shipping
     *
     * @param example
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     *  根据主键删除数据库的记录,tb_order_shipping
     *
     * @param orderId
     */
    int deleteByPrimaryKey(String orderId);

    /**
     *  新写入数据库记录,tb_order_shipping
     *
     * @param record
     */
    int insert(TbOrderShipping record);

    /**
     *  动态字段,写入数据库记录,tb_order_shipping
     *
     * @param record
     */
    int insertSelective(TbOrderShipping record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_order_shipping
     *
     * @param example
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_order_shipping
     *
     * @param orderId
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_order_shipping
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_order_shipping
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_order_shipping
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_order_shipping
     *
     * @param record
     */
    int updateByPrimaryKey(TbOrderShipping record);
}