package com.digitalbase.datasource.mapper;


import com.digitalbase.datasource.beans.Employees;
import com.digitalbase.datasource.beans.EmployeesExample;
import com.digitalbase.datasource.beans.business.ParamsBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int countByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int deleteByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer empNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int insertSelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    List<Employees> selectByExample(EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    Employees selectByPrimaryKey(Integer empNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Employees record);

    Employees selectByEmpNum(@Param("basicInfo") ParamsBean bib);
}