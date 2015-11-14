package net.qingruan.demo.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * NewsType entity. @author MyEclipse Persistence Tools
 */

public class NewsType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private Integer sort;
	private Boolean enable;
	private Set newses = new HashSet(0);

	// Constructors

	/** default constructor */
	public NewsType() {
	}

	/** minimal constructor */
	public NewsType(String title, Integer sort, Boolean enable) {
		this.title = title;
		this.sort = sort;
		this.enable = enable;
	}

	/** full constructor */
	public NewsType(String title, Integer sort, Boolean enable, Set newses) {
		this.title = title;
		this.sort = sort;
		this.enable = enable;
		this.newses = newses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Set getNewses() {
		return this.newses;
	}

	public void setNewses(Set newses) {
		this.newses = newses;
	}

}