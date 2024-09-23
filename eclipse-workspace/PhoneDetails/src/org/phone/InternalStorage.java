package org.phone;

import org.details.studentDetails;

public class InternalStorage {
private void processorName() {
	
System.out.println("i5 Processor");
}
private void ramsize() {

System.out.println("400 ram size");
}
public static void main(String[] args) {
	InternalStorage is=new InternalStorage();
	is.processorName();
	is.ramsize();
	
	studentDetails sd=new studentDetails();
	sd.stuid();
	sd.stuName();
	
}
}
