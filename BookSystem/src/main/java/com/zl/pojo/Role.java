package com.zl.pojo;

import java.util.List;

public class Role {
private Integer rId;
private Integer rrid;
private String rname;
private List<Power> powers;
public Integer getrId() {
	return rId;
}
public void setrId(Integer rId) {
	this.rId = rId;
}
public Integer getRrid() {
	return rrid;
}
public void setRrid(Integer rrid) {
	this.rrid = rrid;
}
public String getRname() {
	return rname;
}
public void setRname(String rname) {
	this.rname = rname;
}
public List<Power> getPowers() {
	return powers;
}
public void setPowers(List<Power> powers) {
	this.powers = powers;
}

}
