package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_item
     *
     * @param example
     */
    long countByExample(TbItemExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_item
     *
     * @param example
     */
    int deleteByExample(TbItemExample example);

    /**
     *  根据主键删除数据库的记录,tb_item
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_item
     *
     * @param record
     */
    int insert(TbItem record);

    /**
     *  动态字段,写入数据库记录,tb_item
     *
     * @param record
     */
    int insertSelective(TbItem record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_item
     *
     * @param example
     */
    List<TbItem> selectByExample(TbItemExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_item
     *
     * @param id
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_item
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_item
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_item
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbItem record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_item
     *
     * @param record
     */
    int updateByPrimaryKey(TbItem record);
}