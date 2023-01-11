package com.lperthel.util;

public class Printer {
public static void print(Object... args){
	for(Object elem:args) {
		System.out.print(elem+ " ");
	}
	System.out.println();
}
}
