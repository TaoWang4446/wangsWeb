package com.wangs.dao;

import java.util.List;
import java.util.Map;

import com.wangs.pojo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> getCustomerList(Map<String, String> params);

	List<Customer> getList();
}