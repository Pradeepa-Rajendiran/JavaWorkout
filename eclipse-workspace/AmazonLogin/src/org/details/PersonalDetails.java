package org.details;

public class PersonalDetails {
	private void LoginName(String Name) {
		System.out.println(" Customer Name is " +Name);

	}
	private void LoginAge(int Age) {
		// TODO Auto-generated method stub
      System.out.println("Customer Age is "+Age);
	}
	private void LoginPhoneNumber(int PhoneNumber) {
		// TODO Auto-generated method stub
      System.out.println("Customer Phone Number is "+PhoneNumber);
	}
public static void main(String[] args) {
	PersonalDetails a=new PersonalDetails();
			a.LoginName("Pradeepa");
	        a.LoginAge(20);
	        a.LoginPhoneNumber(1234567890);
}	

}
