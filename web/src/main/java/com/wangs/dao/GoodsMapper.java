package com.wangs.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Goods;

public interface GoodsMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Goods record);

	int insertSelective(Goods record);

	Goods selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Goods record);

	int updateByPrimaryKey(Goods record);

	List<Goods> getGoodsList(Map<String, String> params);


}