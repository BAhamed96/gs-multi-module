package com.example.common.domain;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public class BaseDomain implements Serializable{
	private static final long serialVersionUID = 9459141616479L;
	
	private boolean deletedFlag;
	private String createdBy; 
	private Date createdDatetime;
	private String updatedBy;
	private Date updatedDatetime;
	
	public BaseDomain() {
		super();
	}
	
	public BaseDomain(	
	 boolean deletedFlag ,String createdBy ,Date createdDatetime ,String updatedBy ,Date updatedDatetime) {
		this.createdBy = createdBy;
		this.createdDatetime = createdDatetime;
		this.deletedFlag = deletedFlag;
		this.updatedBy = updatedBy;
		this.updatedDatetime = updatedDatetime;
	}
	
	@Column(name = "deleted_flag", nullable=false)
	public boolean isDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}
	
	@Column(name = "created_by", nullable=false, insertable = true, updatable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "created_by", length=23, nullable=false, insertable = true, updatable = false)
	public Date getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(Date createdDatetime) {
		this.createdDatetime = createdDatetime;
	}
	
	@Column(name="updated_by")
	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "updated_datetime", length=23, nullable=false, insertable = false)
	public Date getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(Date updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

}
