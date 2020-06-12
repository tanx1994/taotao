package com.taotao.mapper;

import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_item_desc
     *
     * @param example
     */
    long countByExample(TbItemDescExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_item_desc
     *
     * @param example
     */
    int deleteByExample(TbItemDescExample example);

    /**
     *  根据主键删除数据库的记录,tb_item_desc
     *
     * @param itemId
     */
    int deleteByPrimaryKey(Long itemId);

    /**
     *  新写入数据库记录,tb_item_desc
     *
     * @param record
     */
    int insert(TbItemDesc record);

    /**
     *  动态字段,写入数据库记录,tb_item_desc
     *
     * @param record
     */
    int insertSelective(TbItemDesc record);

    /**
     * ,tb_item_desc
     *
     * @param example
     */
    List<TbItemDesc> selectByExampleWithBLOBs(TbItemDescExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_item_desc
     *
     * @param example
     */
    List<TbItemDesc> selectByExample(TbItemDescExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_item_desc
     *
     * @param itemId
     */
    TbItemDesc selectByPrimaryKey(Long itemId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_item_desc
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    /**
     * ,tb_item_desc
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_item_desc
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_item_desc
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbItemDesc record);

    /**
     * ,tb_item_desc
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(TbItemDesc record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_item_desc
     *
     * @param record
     */
    int updateByPrimaryKey(TbItemDesc record);
}