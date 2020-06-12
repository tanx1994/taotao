package com.taotao.mapper;

import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_item_param
     *
     * @param example
     */
    long countByExample(TbItemParamExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_item_param
     *
     * @param example
     */
    int deleteByExample(TbItemParamExample example);

    /**
     *  根据主键删除数据库的记录,tb_item_param
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_item_param
     *
     * @param record
     */
    int insert(TbItemParam record);

    /**
     *  动态字段,写入数据库记录,tb_item_param
     *
     * @param record
     */
    int insertSelective(TbItemParam record);

    /**
     * ,tb_item_param
     *
     * @param example
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_item_param
     *
     * @param example
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_item_param
     *
     * @param id
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_item_param
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * ,tb_item_param
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_item_param
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_item_param
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * ,tb_item_param
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_item_param
     *
     * @param record
     */
    int updateByPrimaryKey(TbItemParam record);
}