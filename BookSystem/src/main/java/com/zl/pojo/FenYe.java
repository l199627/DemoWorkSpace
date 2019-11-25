package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FenYe {
private Integer page;
private Integer rowCount;
private Integer rows=3;
private Integer pageCount;
private Integer startRow;
private Integer endRow;
private Query query;
public FenYe() {
	super();
	// TODO Auto-generated constructor stub
}
public FenYe(Integer page, Integer rowCount, Integer rows, Integer pageCount, Integer startRow, Integer endRow,
		Query query) {
	super();
	this.page = page;
	this.rowCount = rowCount;
	this.rows = rows;
	this.pageCount = pageCount;
	this.startRow = startRow;
	this.endRow = endRow;
	this.query = query;
}
public Integer getPage() {
	return page;
}
public void setPage(Integer page) {
	this.page = page;
}
public Integer getRowCount() {
	return rowCount;
}
public void setRowCount(Integer rowCount) {
	this.rowCount = rowCount;
}
public Integer getRows() {
	return rows;
}
public void setRows(Integer rows) {
	this.rows = rows;
}
public Integer getPageCount() {
	if(getRowCount()%getRows()==0) {
		pageCount=getRowCount()/getRows();
	}else {
		pageCount=getRowCount()/getRows()+1;
	}
	return pageCount;
}
public void setPageCount(Integer pageCount) {
	this.pageCount = pageCount;
}
public Integer getStartRow() {
	startRow=(getPage()-1)*getRows();
	return startRow;
}
public void setStartRow(Integer startRow) {
	this.startRow = startRow;
}
public Integer getEndRow() {
	endRow=getPage()*getRows();
	return endRow;
}
public void setEndRow(Integer endRow) {
	this.endRow = endRow;
}
public Query getQuery() {
	return query;
}
public void setQuery(Query query) {
	this.query = query;
}
@Override
public String toString() {
	return "FenYe [page=" + page + ", rowCount=" + rowCount + ", rows=" + rows + ", pageCount=" + pageCount
			+ ", startRow=" + startRow + ", endRow=" + endRow + ", query=" + query + "]";
}

}
