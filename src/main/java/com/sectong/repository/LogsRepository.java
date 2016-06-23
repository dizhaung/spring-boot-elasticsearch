package com.sectong.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sectong.domain.Logs;

/**
 * 
 * @author jiekechoo
 *
 */

@RestResource(exported = false)
public interface LogsRepository extends ElasticsearchRepository<Logs, String> {
	Page<Logs> findByRawlogOrderByTimestampDesc(String rawlog, Pageable page);
}
