package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//Bean class or model class acts as a container
import java.io.Serializable;

class Employee implements Serializable{
	private int esalary;
	transient private int eid;
	private String ename;
	
	public Employee(int esalary, int eid, String ename) {
		super();
		this.esalary = esalary;
		this.eid = eid;
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
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

	@Override
	public String toString() 
	//Displays current employee details
	{
		return "Employee [esalary=" + esalary + ", eid=" + eid + ", ename=" + ename + "]";
	}
}
public class Serialization1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Employee harini=new Employee(5000,101,"Harini");
		
		//Serialization
		
		FileOutputStream fout= new FileOutputStream("D://ObjectFile.txt");
		//convert txt into object readable mode
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(harini);
		objout.close();
		fout.close();
		System.out.print("Object Saved");
		
		//De-Serialization
		FileInputStream fin=new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp=(Employee) objin.readObject();

		objin.close();
		fin.close();
		System.out.println(emp);
	}

}
