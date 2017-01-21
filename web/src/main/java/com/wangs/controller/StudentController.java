package com.wangs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangs.pojo.Student;
import com.wangs.service.IStudentService;

@Controller
@RequestMapping("/studentController")
public class StudentController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Resource
	private IStudentService studentService;

	@ResponseBody
	@RequestMapping("/batchInserStu")
	public Map<String, Object> batchInserStu(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();

		Map<String, Object> result = new HashMap<String, Object>();
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 3; i++) {
			Student s = new Student();
			s.setAge(3 + i);
			s.setName("wt" + i);
			students.add(s);
		}
		int count = studentService.batchInserStu(students);
		result = successMap("批量插入成功");
		result.put("msg", count);
		return result;
	}

	@ResponseBody
	@RequestMapping("/batchUpdateStu")
	public Map<String, Object> batchUpdateStu(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();

		Map<String, Object> result = new HashMap<String, Object>();
		List<Integer> ids = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			ids.add(i);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ids", ids);
		map.put("name", "wangs");
		int count = studentService.batchUpdateStu(map);
		result = successMap("批量更新成功");
		result.put("msg", count);
		return result;
	}

	@ResponseBody
	@RequestMapping("/batchDelStu")
	public Map<String, Object> batchDelStu(HttpServletRequest request) {
		Map<String, String> params = new HashMap<String, String>();

		Map<String, Object> result = new HashMap<String, Object>();
		List<Integer> ids = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			ids.add(i);
		}
		int count = studentService.batchDelStu(ids);
		result = successMap("批量删除成功");
		result.put("msg", count);
		return result;
	}

}