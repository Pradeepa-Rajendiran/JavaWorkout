package org.Firstloop;

public class Values {
	public static void main(String[] args) {
//		2:2 array format
		int a[][]=new int[2][2];
		a[0][0]=90;
		a[0][1]=80;
		a[1][0]=50;
		a[1][1]=60;
		
		
//	for loop =index based value
		
		for(int i=0;i<a.length;i++) { 
			for (int j=0;j<a.length;j++) {
			System.out.println(a[i][j]);
		}
	}
		
		System.out.println("----------------------------------");
		
//		nested Enhanced for loop =value based
		
		for(int [] b:a) {
			for(int c:b) {
			System.out.println(c);
		}
		}
//
			

	}
	
}
