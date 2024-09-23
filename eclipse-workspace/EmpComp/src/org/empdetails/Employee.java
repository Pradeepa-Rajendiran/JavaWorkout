package org.empdetails;

public class Employee {
	private void empId() {
		// TODO Auto-generated method stub
System.out.println(" employee id is45678");
	}
	private void empName() {
		// TODO Auto-generated method stub
System.out.println(" employee name is Pradeepa");
	}
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.empId();
	emp.empName();
	
	Company comp=new Company();
	comp.compId();
	comp.compName();
}
}
