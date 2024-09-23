package org.methods;
//same class
//same method
//different arguments
public class Compdata {
//
//	private void empData(String name) {
//		System.out.println("My Employee Name is "+name);
//
//	}
//	private void empData(int age) {
//		System.out.println("My employee age is "+age);
//	}
//	
//public static void main(String[] args) {
//	Compdata Data=new Compdata();
//	Data.empData("Pradeepa");
//	Data.empData(20);
//}	

//arguments depend on datatype(one method one argument)
//private void empData(String name) {
//	System.out.println("My Employee Name is "+name);
//
//}
//private void empData(int age) {
//	System.out.println("My employee age is "+age);
//}

//arguments depend on datatype count(one method more than one arguments)
//private void empData(String name,int a) {
//	System.out.println("My Employee Name is "+name);
//
//}
//private void empData(int age) {
//	System.out.println("My employee age is "+age);
//}


//arguments depends on the datatype order(more than one arguments but order change)

private void empData(String name,int a) {
	System.out.println("My Employee Name is "+name);
 
}
private void empData(int age,String name) {
	System.out.println("My employee age is "+age);
}
private void empData(char a) {

	System.out.println("My employee age is "+a);
}

public static void main(String[] args) {
Compdata Data=new Compdata();
Data.empData("Pradeepa",10);
Data.empData(20,"Bommi");

//Data.empData("Pradeepa",50);
//Data.empData(20);
//
//Data.empData("Pradeepa");
//Data.empData(20);
}	

}


