package com.digitalbase.datasource.controller;

import com.digitalbase.datasource.beans.Country;
import com.digitalbase.datasource.beans.Employees;
import com.digitalbase.datasource.beans.business.ParamsBean;
import com.digitalbase.datasource.mapper.CountryMapper;
import com.digitalbase.datasource.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangc
 * @Date: 2018/10/21 22:11
 * @Description: 使用@Controller注解, 不会把返回值成json, 返回的hello会指向hello.html
 */
@RestController public class TestController2 {
    @Value("s{default-ds}")
    private String dsName;
    @Value("${mysql-server-port}")
    private int port;

    @Autowired private EmployeesMapper employeesMapper;

    @Autowired private CountryMapper countryMapper;

    @RequestMapping("/hello") public String sayHello() {
        // model.addAttribute("name", "老王");
        return "hello";
    }

    @RequestMapping("/getOneEmp") public String getOneEmp() {
        Employees employees = employeesMapper.selectByPrimaryKey(10019);
        return employees.toString();
    }

    @RequestMapping("/getOneCountry") public String getOneCountry() {
        Country country = countryMapper.selectByPrimaryKey("ABW");
        return country.toString();
    }

    @RequestMapping("/getTest") public String test001() {
        ParamsBean bib = new ParamsBean();
        bib.setBaseName("world");
        bib.setDsName("ds2");
        bib.setPort(33062);
        bib.setPara2(10019);
        bib.setPara1("ZombieLand");
        Country country = countryMapper.selectByName(bib);
        return country.toString();
    }

    @RequestMapping("/getTest2") public String test002() {
        ParamsBean bib = new ParamsBean();
        bib.setBaseName("employees");
        bib.setDsName("ds1");
        bib.setPort(3306);
        bib.setPara2(10001);
        bib.setPara1("American Samoa");
        Employees employee = employeesMapper.selectByEmpNum(bib);
        return employee.toString();
    }
}
