package com.chatter.chatter.persistence.tables;

import java.io.Serializable;
import java.util.Date;

public interface BaseTable extends Serializable {
	
	public void setId(String id);
	public String getId();
	public void setCreated(Date created);
	public Date getCreated();
	public void setUpdated(Date updated);
	public Date getUpdated();
	public void setCreatedBy(String createdBy);
	public String getCreatedBy();
	public void setUpdatedBy(String updatedBy);
	public String getUpdatedBy();

}
