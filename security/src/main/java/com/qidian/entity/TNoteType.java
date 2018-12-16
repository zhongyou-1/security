package com.qidian.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_note_type database table.
 * 
 */
@Entity
@Table(name="t_note_type")
@NamedQuery(name="TNoteType.findAll", query="SELECT t FROM TNoteType t")
public class TNoteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Temporal(TemporalType.DATE)
	private Date crateAt;

	private String name;

	private String status;

	@Temporal(TemporalType.DATE)
	private Date updateAt;

	private String uuid;

	public TNoteType() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCrateAt() {
		return this.crateAt;
	}

	public void setCrateAt(Date crateAt) {
		this.crateAt = crateAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateAt() {
		return this.updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid ;
	}    

}