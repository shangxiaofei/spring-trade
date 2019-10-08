package com.spring.sxf.study.springtradedao.mapper;

import com.spring.sxf.study.springtradedao.entry.Blog;
import com.spring.sxf.study.springtradedao.entry.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    Blog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blog
     *
     * @mbggenerated Thu Sep 26 17:15:45 CST 2019
     */
    int updateByPrimaryKey(Blog record);
}