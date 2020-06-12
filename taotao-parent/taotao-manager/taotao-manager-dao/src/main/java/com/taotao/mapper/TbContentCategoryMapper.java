package com.taotao.mapper;

import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentCategoryMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_content_category
     *
     * @param example
     */
    long countByExample(TbContentCategoryExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_content_category
     *
     * @param example
     */
    int deleteByExample(TbContentCategoryExample example);

    /**
     *  根据主键删除数据库的记录,tb_content_category
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_content_category
     *
     * @param record
     */
    int insert(TbContentCategory record);

    /**
     *  动态字段,写入数据库记录,tb_content_category
     *
     * @param record
     */
    int insertSelective(TbContentCategory record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_content_category
     *
     * @param example
     */
    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_content_category
     *
     * @param id
     */
    TbContentCategory selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_content_category
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_content_category
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_content_category
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbContentCategory record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_content_category
     *
     * @param record
     */
    int updateByPrimaryKey(TbContentCategory record);
}