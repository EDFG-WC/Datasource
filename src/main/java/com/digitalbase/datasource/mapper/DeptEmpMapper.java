package com.digitalbase.datasource.mapper;

import com.digitalbase.datasource.beans.DeptEmp;
import com.digitalbase.datasource.beans.DeptEmpExample;
import com.digitalbase.datasource.beans.DeptEmpKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int countByExample(DeptEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int deleteByExample(DeptEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(DeptEmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int insert(DeptEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int insertSelective(DeptEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    List<DeptEmp> selectByExample(DeptEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    DeptEmp selectByPrimaryKey(DeptEmpKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeptEmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept_emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeptEmp record);
}