package com.wangs.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.wangs.dao.StudentMapper;
import com.wangs.pojo.Student;
import com.wangs.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private StudentMapper studentDao;

	@Override
	public int batchInserStu(List<Student> students) {
		return studentDao.batchInserStu(students);
	}

	@Override
	public int batchUpdateStu(Map<String, Object> map) {
		return studentDao.batchUpdateStu(map);
	}

	@Override
	public int batchDelStu(List<Integer> ids) {
		return studentDao.batchDelStu(ids);
	}

}
