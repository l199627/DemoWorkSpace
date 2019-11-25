package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Lx {
private Integer lxid;
private String lxname;
public Lx() {
	super();
	// TODO Auto-generated constructor stub
}
public Lx(Integer lxid, String lxname) {
	super();
	this.lxid = lxid;
	this.lxname = lxname;
}
public Integer getLxid() {
	return lxid;
}
public void setLxid(Integer lxid) {
	this.lxid = lxid;
}
public String getLxname() {
	return lxname;
}
public void setLxname(String lxname) {
	this.lxname = lxname;
}
@Override
public String toString() {
	return "Lx [lxid=" + lxid + ", lxname=" + lxname + "]";
}

}
