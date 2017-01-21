package com.wangs.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.wangs.pojo.Goods;
import com.wangs.pojo.Student;

public interface IStudentService {

	int batchInserStu(List<Student> students);

	int batchUpdateStu(Map<String, Object> map);

	int batchDelStu(List<Integer> ids);

}
