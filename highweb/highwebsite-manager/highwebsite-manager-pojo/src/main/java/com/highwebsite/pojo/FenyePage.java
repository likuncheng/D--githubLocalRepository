package com.highwebsite.pojo;

public class FenyePage {

	private int totalCount;//一共有多少条记录
	private int RepresentPage;//当前页数
	private int pageCount;//一页展示多少条记录
	private int totalPage;//一共有多少页
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getRepresentPage() {
		return RepresentPage;
	}
	public void setRepresentPage(int representPage) {
		RepresentPage = representPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "FenyePage [totalCount=" + totalCount + ", RepresentPage=" + RepresentPage + ", pageCount=" + pageCount
				+ ", totalPage=" + totalPage + "]";
	}
	
}
