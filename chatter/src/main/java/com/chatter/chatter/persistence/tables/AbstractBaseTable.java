package com.chatter.chatter.persistence.tables;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

public abstract class AbstractBaseTable implements BaseTable {

	@Id
	private String id;
	@CreatedDate
	private Date created;
	@LastModifiedDate
	private Date updated;
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String updatedBy;
	@Version
	private Long version;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public Date getCreated() {
		return created;
	}

	@Override
	public Date getUpdated() {
		return updated;
	}

	@Override
	public String getCreatedBy() {
		return createdBy;
	}

	@Override
	public String getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setId(String id) {
		this.id = id;		
	}

	@Override
	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;		
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
}
