package net.qingruan.demo.vo;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer id;
	private NewsType newsType;
	private String title;
	private String info;
	private Integer adminId;
	private Timestamp inputTime;
	private Boolean isHot;
	private Boolean isTop;
	private Boolean enable;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(NewsType newsType, String title, String info, Integer adminId,
			Timestamp inputTime, Boolean isHot, Boolean isTop, Boolean enable) {
		this.newsType = newsType;
		this.title = title;
		this.info = info;
		this.adminId = adminId;
		this.inputTime = inputTime;
		this.isHot = isHot;
		this.isTop = isTop;
		this.enable = enable;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NewsType getNewsType() {
		return this.newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Timestamp getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Timestamp inputTime) {
		this.inputTime = inputTime;
	}

	public Boolean getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	public Boolean getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}