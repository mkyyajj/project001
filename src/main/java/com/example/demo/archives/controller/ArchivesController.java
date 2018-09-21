package com.example.demo.archives.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archives")
public class ArchivesController {
	@RequestMapping
    public String home() {
		return "Hello World!";
	}
	@RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
      Map<String, String> map = new HashMap<>();
      map.put("name", name);
      return map;
  }

  @RequestMapping("/list")
  public List<Map<String, String>> getList() {
      List<Map<String, String>> list = new ArrayList<>();
      Map<String, String> map = null;
      for (int i = 1; i <= 5; i++) {
          map = new HashMap<>();
          map.put("name", "Admin-" + i);
          list.add(map);
      }
      return list;
  }
}
