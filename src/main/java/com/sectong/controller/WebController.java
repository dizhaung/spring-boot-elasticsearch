package com.sectong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sectong.domain.Logs;
import com.sectong.service.LogsService;

@RestController
@RequestMapping("/api")
public class WebController {

	@Autowired
	private LogsService logsService;

	@RequestMapping("search")
	public Page<Logs> search(@RequestParam(required = true, defaultValue = "*") String keywords, Pageable page) {

		return logsService.getByRawlog(keywords, page);
	}

}
