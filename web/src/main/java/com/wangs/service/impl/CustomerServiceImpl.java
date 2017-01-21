package com.wangs.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangs.dao.CustomerMapper;
import com.wangs.pojo.Customer;
import com.wangs.service.ICustomerService;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Resource()
	private CustomerMapper customerDao;

	@Override
	public PageInfo<Customer> getCustomerList(Map<String, String> params) {
		PageHelper.startPage(1, 2);
		List<Customer> list = customerDao.getCustomerList(params);
		PageInfo<Customer> page = new PageInfo<>(list);
		return page;
	}

	@Override
	public PageInfo<Customer> getList() {
		PageHelper.startPage(1, 2);
		List<Customer> list = customerDao.getList();
		PageInfo<Customer> page = new PageInfo<>(list);
		return page;
	}

}
