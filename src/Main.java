package com.cg.test;

/*
 * 	In this class, we implemented operation method of FuncInterface 8 times, you can implement
 * 	it further with any type of variable and any type of operation.
 * 
 *  This feature is new to JAVA and also called functional programming.
 *  This is introduced in JDK 1.8 onward.
 *  
 *  
 * */


public class Main {

	public static void main(String[] args) {
		int a=10, b=5;
		double dA=10.0, dB=5.0;
		
		FuncInterface<Integer> add = (x,y) -> x+y;
		System.out.println(add.operation(a, b)); // OUTPUT: 15
		
		FuncInterface<Integer> sub = (x,y) -> x-y;
		System.out.println(sub.operation(a, b)); // OUTPUT: 5
		
		FuncInterface<Integer> mul = (x,y) -> x*y;
		System.out.println(mul.operation(a, b)); // OUTPUT: 50
		
		FuncInterface<Integer> div = (x,y) -> x/y;
		System.out.println(div.operation(a, b)); // OUTPUT: 2
		
//		Used same function for operation on double type variables
		
		FuncInterface<Double> doubleAdd = (x,y) -> x+y;
		System.out.println(doubleAdd.operation(dA, dB)); // OUTPUT: 15.0
		
		FuncInterface<Double> doubleSub = (x,y) -> x-y;
		System.out.println(doubleSub.operation(dA, dB)); // OUTPUT: 5.0
		
		FuncInterface<Double> doubleMul = (x,y) -> x*y;
		System.out.println(doubleMul.operation(dA, dB)); // OUTPUT: 50.0
		
		FuncInterface<Double> doubleDiv = (x,y) -> x/y;
		System.out.println(doubleDiv.operation(dA, dB)); // OUTPUT: 2.0
	}

}
