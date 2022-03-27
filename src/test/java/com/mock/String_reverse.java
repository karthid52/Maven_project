package com.mock;

public class String_reverse {

	public static void main(String[] args) {
		String s = "thermofisher scientific";
		String s1 = s.substring(0, 12);
		String s2 = s.substring(13, 23);

		StringBuffer s3 = new StringBuffer(s1);
		StringBuffer s4 = s3.reverse();

		System.out.println(s4 + " " + s2);

	}

}
