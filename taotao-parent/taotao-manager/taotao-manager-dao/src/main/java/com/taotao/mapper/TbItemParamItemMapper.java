package com.taotao.mapper;

import com.taotao.pojo.TbItemParamItem;
import com.taotao.pojo.TbItemParamItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamItemMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_item_param_item
     *
     * @param example
     */
    long countByExample(TbItemParamItemExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_item_param_item
     *
     * @param example
     */
    int deleteByExample(TbItemParamItemExample example);

    /**
     *  根据主键删除数据库的记录,tb_item_param_item
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_item_param_item
     *
     * @param record
     */
    int insert(TbItemParamItem record);

    /**
     *  动态字段,写入数据库记录,tb_item_param_item
     *
     * @param record
     */
    int insertSelective(TbItemParamItem record);

    /**
     * ,tb_item_param_item
     *
     * @param example
     */
    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_item_param_item
     *
     * @param example
     */
    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_item_param_item
     *
     * @param id
     */
    TbItemParamItem selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_item_param_item
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * ,tb_item_param_item
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_item_param_item
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_item_param_item
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbItemParamItem record);

    /**
     * ,tb_item_param_item
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_item_param_item
     *
     * @param record
     */
    int updateByPrimaryKey(TbItemParamItem record);
}