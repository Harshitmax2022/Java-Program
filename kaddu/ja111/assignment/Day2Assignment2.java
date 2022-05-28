package com.assignment;

public class Day2Assignment2 {
 static void myMethod(int score ) {
	 if(score<2 | score>100) {
		 System.out.println("Invalid number");
	 }else {
		 for(int i=1; i<=score; i++) {
			 if(score%i==0) {
				 System.out.println(i);
			 }
		 }
	 }
 }
 
 public static void main(String[] argu) {
	myMethod(12);
}
}
