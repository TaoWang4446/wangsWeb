package com.wangs.service;

import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Customer;

public interface ICustomerService {

	PageInfo<Customer> getCustomerList(Map<String, String> params);

	PageInfo<Customer> getList();
	
}
