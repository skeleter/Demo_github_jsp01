package com.dt.pojo;

public class City {
	private int cid;
	private String cname;
	private int pid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public City(int cid, String cname, int pid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.pid = pid;
	}
	public City() {
		super();
		
	}
	
	/**   
	 * @title: toString
	 * @description: TODO
	 * @return   
	 * @see java.lang.Object#toString()     
	 */ 
	@Override
	public String toString() {
		return "City [cid=" + cid + ", cname=" + cname + ", pid=" + pid + "]";
	}
}
