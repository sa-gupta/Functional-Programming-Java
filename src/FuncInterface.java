package com.cg.test;

/**
 *	This interface is called functional interface because it only contains one function.
 *	to make use of this interface efficiently, we can operate the only function	present 
 *	in this interface to implement add, sub, multiply and divide.
 *
 *	Now, there two ways to implement this interface 
 *	either, by creating a class and implement the function.
 *	or, by creating anonymous class or lambda function.
 *
 *	Here, T is the type argument. It can be either int, double, short, byte, char
 *	
 *	Go see main class for implementation.
 *
 *  @FunctionalInterface annotation is optional, putting this comes under best practice.
 */

@FunctionalInterface
public interface FuncInterface <T>{
	T operation(T a, T b);
}

