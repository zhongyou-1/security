package com.qidian.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;  


/**
 * The persistent class for the t_note database table.
 * 
 */
@Entity
@Table(name="t_note")
@NamedQuery(name="TNote.findAll", query="SELECT t FROM TNote t")
public class TNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Lob
	private String content;

	@Temporal(TemporalType.DATE)
	private Date creatAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_at")
	private Date createAt;

	private byte mark;

	private String status;

	private String title;

	private BigInteger type;

	@Temporal(TemporalType.DATE)
	private Date updateAt;

	private String uuid;

	public TNote() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatAt() {
		return this.creatAt;
	}

	public void setCreatAt(Date creatAt) {
		this.creatAt = creatAt;
	}

	public Date getCreateAt() {
		return this.createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public byte getMark() {
		return this.mark;
	}

	public void setMark(byte mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigInteger getType() {
		return this.type;
	}

	public void setType(BigInteger type) {
		this.type = type;
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
		this.uuid = uuid;
	}

}