package org.methods;

public class AllMethods {
public static void main(String[] args) {
	String Name="Sri Shanmugha college of Engineering and technology";
	
	char charAt = Name.charAt(4);
	System.out.println(charAt);
	
	int indexOf = Name.indexOf("m");
	System.out.println(indexOf);
	
	int lastIndexOf = Name.lastIndexOf("g");
	System.out.println(lastIndexOf);
	
	int length = Name.length();
	System.out.println(length);
	
	boolean empty = Name.isEmpty();
	System.out.println(empty);
	
	boolean contains = Name.contains("i");
	System.out.println(contains);
	
//	String trim = Name.trim();
//	System.out.println(trim);
	
	boolean startsWith = Name.startsWith("py");
	System.out.println(startsWith);
	
    boolean endsWith = Name.endsWith("ng");	
    System.out.println(endsWith);
    
    String upperCase = Name.toUpperCase();
    System.out.println(upperCase);
    
    String lowerCase = Name.toLowerCase();
    System.out.println(lowerCase);
    
    String a="Pradeepa";
    String b="PRADEEPA";
    
    boolean equals = a.equals(b);
    System.out.println(equals);
    
    boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
    System.out.println(equalsIgnoreCase);
    
    String replace = Name.replace("P", "p");
    System.out.println(replace);
    
    String replaceAll = Name.replaceAll("Python Programming","JavaScript");
    System.out.println(replaceAll);
    
    String substring = Name.substring(7);
    System.out.println(substring);
    
    CharSequence subSequence = Name.subSequence(0, 14);
    System.out.println(subSequence);
    
    int compareTo = a.compareTo(b);
    System.out.println(compareTo);
    
    
	
}
}
