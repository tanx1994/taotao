package com.taotao.mapper;

import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_item_cat
     *
     * @param example
     */
    long countByExample(TbItemCatExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_item_cat
     *
     * @param example
     */
    int deleteByExample(TbItemCatExample example);

    /**
     *  根据主键删除数据库的记录,tb_item_cat
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_item_cat
     *
     * @param record
     */
    int insert(TbItemCat record);

    /**
     *  动态字段,写入数据库记录,tb_item_cat
     *
     * @param record
     */
    int insertSelective(TbItemCat record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_item_cat
     *
     * @param example
     */
    List<TbItemCat> selectByExample(TbItemCatExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_item_cat
     *
     * @param id
     */
    TbItemCat selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_item_cat
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_item_cat
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_item_cat
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbItemCat record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_item_cat
     *
     * @param record
     */
    int updateByPrimaryKey(TbItemCat record);
}