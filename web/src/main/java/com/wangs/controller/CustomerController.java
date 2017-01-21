package com.wangs.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Customer;
import com.wangs.pojo.User;
import com.wangs.service.ICustomerService;
import com.wangs.utils.utils.StringUtils;

@Controller
@RequestMapping("/customerController")
public class CustomerController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Resource
	private ICustomerService customerService;

	@ResponseBody
	@RequestMapping("/getCustomerList")
	public Map<String, Object> getCustomerList(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();

		try {

			PageInfo<Customer> page = customerService.getCustomerList(params);
			// PageInfo page = userService.getUserListByPage(id);

			result = successMap("查询成功");
			result.put("data", page);

		} catch (Exception e) {
			logger.error("查询失败{}", e);
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/getList")
	public Map<String, Object> getList(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();

		try {

			PageInfo<Customer> page = customerService.getList();
			// PageInfo page = userService.getUserListByPage(id);

			result = successMap("查询成功");
			result.put("data", page);

		} catch (Exception e) {
			logger.error("查询失败{}", e);
		}
		return result;
	}

}