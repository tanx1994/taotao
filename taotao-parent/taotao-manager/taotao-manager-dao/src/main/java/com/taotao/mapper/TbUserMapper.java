package com.taotao.mapper;

import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    /**
     *  根据指定的条件获取数据库记录数,tb_user
     *
     * @param example
     */
    long countByExample(TbUserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,tb_user
     *
     * @param example
     */
    int deleteByExample(TbUserExample example);

    /**
     *  根据主键删除数据库的记录,tb_user
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,tb_user
     *
     * @param record
     */
    int insert(TbUser record);

    /**
     *  动态字段,写入数据库记录,tb_user
     *
     * @param record
     */
    int insertSelective(TbUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,tb_user
     *
     * @param example
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     *  根据指定主键获取一条数据库记录,tb_user
     *
     * @param id
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,tb_user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,tb_user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,tb_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     *  根据主键来更新符合条件的数据库记录,tb_user
     *
     * @param record
     */
    int updateByPrimaryKey(TbUser record);
}