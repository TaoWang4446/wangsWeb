package com.wangs.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Goods;
import com.wangs.service.IGoodsService;
import com.wangs.utils.utils.StringUtils;

@Controller
@RequestMapping("/goodsController")
public class GoodsController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger(GoodsController.class);

	@Resource
	private IGoodsService goodsService;

	@ResponseBody
	@RequestMapping("/getGoodsList")
	public Map<String, Object> getUserList(HttpServletRequest request) {
		String pageNo = request.getParameter("pageNo");
		String pageSize = request.getParameter("pageSize");

		Integer pageN = StringUtils.isEmpty(pageNo) ? null : Integer.valueOf(pageNo);
		Integer pageS = StringUtils.isEmpty(pageSize) ? null : Integer.valueOf(pageSize);
		Map<String, String> params = new HashMap<String, String>();

		PageInfo<Goods> page = goodsService.getGoodsListByPage(params, pageN, pageS);
		Map<String, Object> result = new HashMap<String, Object>();
		result = successMap("查询成功");
		result.put("data", page);
		return result;
	}

}