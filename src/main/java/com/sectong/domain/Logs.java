package com.sectong.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.sectong.BootElastic;

/**
 * 
 * @author jiekechoo
 *
 */

@Document(indexName = BootElastic.INDEX_NAME, type = "ApacheAccessLog")
public class Logs {

	@Id
	private String id;

	private String timestamp;
	private String rawlog;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getRawlog() {
		return rawlog;
	}

	public void setRawlog(String rawlog) {
		this.rawlog = rawlog;
	}

}
