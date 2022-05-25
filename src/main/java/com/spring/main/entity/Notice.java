package com.spring.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "notice")
@Table(name = "notice")
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String advantage;
	private String noticeHeader;
	private String noticeBody;
	private String noticeDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	public String getNoticeHeader() {
		return noticeHeader;
	}
	public void setNoticeHeader(String noticeHeader) {
		this.noticeHeader = noticeHeader;
	}
	public String getNoticeBody() {
		return noticeBody;
	}
	public void setNoticeBody(String noticeBody) {
		this.noticeBody = noticeBody;
	}
	public String getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}
	

}
