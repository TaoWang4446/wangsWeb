package com.wangs.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangs.dao.GoodsMapper;
import com.wangs.pojo.Goods;
import com.wangs.service.IGoodsService;

@Service
public class GoodsServiceImpl implements IGoodsService {

	@Resource
	private GoodsMapper goodsDao;

	@Override
	public PageInfo<Goods> getGoodsListByPage(Map<String, String> params, Integer pageN, Integer pageS) {

		pageN = pageN == null ? 1 : pageN;
		pageS = pageS == null ? 10 : pageS;
		PageHelper.startPage(pageN, pageS);
		List<Goods> list = goodsDao.getGoodsList(params);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		return page;
	}

}
