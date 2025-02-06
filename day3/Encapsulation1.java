package com.celcom.day3;

public class Encapsulation1 {
	
	private int eid;
	private String ename;
	private int esalary;
	
	public Encapsulation1() {
		
	}
	

	public Encapsulation1(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
