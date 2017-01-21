package com.wangs.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

	public Map<String, Object> successMap(String message) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("message", message);
		return map;
	}

	public Map<String, Object> failMap(String message) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", false);
		map.put("message", message);
		return map;
	}
}
