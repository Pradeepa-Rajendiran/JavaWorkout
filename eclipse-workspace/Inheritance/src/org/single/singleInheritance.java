package org.single;
//child class
public class singleInheritance extends Compdetails {
	public void stuid() {
		// TODO Auto-generated method stub
System.out.println("Student id is S001");
	}
	public void stuname() {
		// TODO Auto-generated method stub
System.out.println("student name is Pradeepa");
	}
public static void main(String[] args) {
	singleInheritance Inherit = new singleInheritance();
	Inherit.stuid();
	Inherit.stuname();
	Inherit.compid();
	Inherit.compname();
	Inherit.Tlid();
	Inherit.TlName();
}
}
