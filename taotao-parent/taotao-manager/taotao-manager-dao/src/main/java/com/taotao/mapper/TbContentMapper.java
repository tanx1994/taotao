package com.taotao.mapper;

import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_content
     *
     * @param example
     */
    long countByExample(TbContentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_content
     *
     * @param example
     */
    int deleteByExample(TbContentExample example);

    /**
     *  根据主键删除数据库的记录,tb_content
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_content
     *
     * @param record
     */
    int insert(TbContent record);

    /**
     *  动态字段,写入数据库记录,tb_content
     *
     * @param record
     */
    int insertSelective(TbContent record);

    /**
     * ,tb_content
     *
     * @param example
     */
    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_content
     *
     * @param example
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_content
     *
     * @param id
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_content
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * ,tb_content
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_content
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_content
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     * ,tb_content
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(TbContent record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_content
     *
     * @param record
     */
    int updateByPrimaryKey(TbContent record);
}