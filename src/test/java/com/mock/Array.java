package com.mock;

public class Array {

	
	
	public static void task1() {
		
	
	
		
		String[][]a= {{"7","8","9","10"},{"4","5","6"," "},{"2","3"," "," "},{"1"," "," "," "}};
		String[][]b=new String[4][4];
		
		
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				b[row][col]=a[row][col];
				System.out.print(b[row][col]+"  ");
		
			}
		System.out.println();
		}
		System.out.println("==========================================");
	}
	
	public static void task2() {
		
		String[][]a= {{"1","2","3","*"},{"1","2","*","4"},{"1","*","3","4"},{"*","2","3","4"}};
		String[][]b=new String[4][4];
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				b[row][col]=a[row][col];
				System.out.print(b[row][col]+"  ");
		
			}
		System.out.println();
	}}
	
 public static void main(String[] args) {
	task1();
	task2();
	 
	 
	 	
}
}
