package net.qingruan.demo.vo;

public class NewsType {

	
	private Integer id;
	private String title;
	private Integer sort;
	private Boolean enable;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
}
