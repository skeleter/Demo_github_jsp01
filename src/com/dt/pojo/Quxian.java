package com.dt.pojo;

public class Quxian {
	private int qid;
	private String qname;
	private int cid;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Quxian(int qid, String qname, int cid) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.cid = cid;
	}
	public Quxian() {
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
		return "Quxian [qid=" + qid + ", qname=" + qname + ", cid=" + cid + "]";
	}
	
}
