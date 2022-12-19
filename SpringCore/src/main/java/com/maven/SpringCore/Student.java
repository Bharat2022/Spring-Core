package com.maven.SpringCore;

public class Student {
	private int sId;
	private String sName;
	private double sPerc;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsPerc() {
		return sPerc;
	}
	public void setsPerc(double sPerc) {
		this.sPerc = sPerc;
	}
	public Student(int sId, String sName, double sPerc) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sPerc = sPerc;
	}
	public Student() {
		super(); 
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPerc=" + sPerc + "]";
	}
	
}
