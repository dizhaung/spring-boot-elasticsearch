package com.sectong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sectong.domain.Logs;
import com.sectong.repository.LogsRepository;

/**
 * 
 * @author jiekechoo
 *
 */
@Service
public class LogsService {

	@Autowired
	private LogsRepository repository;

	public Page<Logs> getByRawlog(String rawlog, Pageable page) {
		return repository.findByRawlogOrderByTimestampDesc(rawlog, page);
	}
}
