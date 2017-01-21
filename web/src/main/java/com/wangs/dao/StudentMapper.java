package com.wangs.dao;

import java.util.List;
import java.util.Map;

import com.wangs.pojo.Student;

public interface StudentMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);

	int batchInserStu(List<Student> students);

	int batchUpdateStu(Map<String, Object> map);

	int batchDelStu(List<Integer> ids);
}