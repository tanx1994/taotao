package com.taotao.mapper;

import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_order
     *
     * @param example
     */
    long countByExample(TbOrderExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_order
     *
     * @param example
     */
    int deleteByExample(TbOrderExample example);

    /**
     *  根据主键删除数据库的记录,tb_order
     *
     * @param orderId
     */
    int deleteByPrimaryKey(String orderId);

    /**
     *  新写入数据库记录,tb_order
     *
     * @param record
     */
    int insert(TbOrder record);

    /**
     *  动态字段,写入数据库记录,tb_order
     *
     * @param record
     */
    int insertSelective(TbOrder record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_order
     *
     * @param example
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_order
     *
     * @param orderId
     */
    TbOrder selectByPrimaryKey(String orderId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_order
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_order
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_order
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_order
     *
     * @param record
     */
    int updateByPrimaryKey(TbOrder record);
}