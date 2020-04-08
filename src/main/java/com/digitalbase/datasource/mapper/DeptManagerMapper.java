package com.digitalbase.datasource.mapper;

import com.digitalbase.datasource.beans.DeptManager;
import com.digitalbase.datasource.beans.DeptManagerExample;
import com.digitalbase.datasource.beans.DeptManagerKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int countByExample(DeptManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int deleteByExample(DeptManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(DeptManagerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int insert(DeptManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int insertSelective(DeptManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    List<DeptManager> selectByExample(DeptManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    DeptManager selectByPrimaryKey(DeptManagerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeptManager record, @Param("example") DeptManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeptManager record, @Param("example") DeptManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeptManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_manager
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeptManager record);
}