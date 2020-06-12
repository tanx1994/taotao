package com.taotao.mapper;

import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderItemMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_order_item
     *
     * @param example
     */
    long countByExample(TbOrderItemExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_order_item
     *
     * @param example
     */
    int deleteByExample(TbOrderItemExample example);

    /**
     *  根据主键删除数据库的记录,tb_order_item
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录,tb_order_item
     *
     * @param record
     */
    int insert(TbOrderItem record);

    /**
     *  动态字段,写入数据库记录,tb_order_item
     *
     * @param record
     */
    int insertSelective(TbOrderItem record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_order_item
     *
     * @param example
     */
    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_order_item
     *
     * @param id
     */
    TbOrderItem selectByPrimaryKey(String id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_order_item
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_order_item
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_order_item
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbOrderItem record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_order_item
     *
     * @param record
     */
    int updateByPrimaryKey(TbOrderItem record);
}