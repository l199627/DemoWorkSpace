package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Query {
private String qbookname;
private Integer qlxid;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date qStartshijian;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date qEndshijian;
public Query() {
	super();
	// TODO Auto-generated constructor stub
}
public Query(String qbookname, Integer qlxid, Date qStartshijian, Date qEndshijian) {
	super();
	this.qbookname = qbookname;
	this.qlxid = qlxid;
	this.qStartshijian = qStartshijian;
	this.qEndshijian = qEndshijian;
}
public String getQbookname() {
	return qbookname;
}
public void setQbookname(String qbookname) {
	this.qbookname = qbookname;
}
public Integer getQlxid() {
	return qlxid;
}
public void setQlxid(Integer qlxid) {
	this.qlxid = qlxid;
}
public Date getqStartshijian() {
	return qStartshijian;
}
public void setqStartshijian(Date qStartshijian) {
	this.qStartshijian = qStartshijian;
}
public Date getqEndshijian() {
	return qEndshijian;
}
public void setqEndshijian(Date qEndshijian) {
	this.qEndshijian = qEndshijian;
}
@Override
public String toString() {
	return "Query [qbookname=" + qbookname + ", qlxid=" + qlxid + ", qStartshijian=" + qStartshijian + ", qEndshijian="
			+ qEndshijian + "]";
}

}
