package com.wangs.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Goods;

public interface IGoodsService {

	PageInfo<Goods> getGoodsListByPage(Map<String, String> params, Integer pageN, Integer pageS);

	
}
