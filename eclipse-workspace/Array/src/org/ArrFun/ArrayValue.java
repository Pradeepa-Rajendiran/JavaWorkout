package org.ArrFun;

public class ArrayValue {
	public static void main(String[] args) {
//		Syntax ---dataType varaiableName[]=new variableName[]
		
		int value[]=new int[5];
		value[0]=10;
		value[1]=20;
		value[2]=30;
		value[3]=40;
		value[4]=50;
		
		for (int i=0;i<=4;i++) {
			System.out.println(value[i]);
		}
		
		System.out.println("----------------------------------");
		
		for (int b:value) {
			System.out.println(b);
		}
		
	}

}
