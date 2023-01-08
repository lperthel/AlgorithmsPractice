package com.lperthel.util;

public class Printer {
public void print(Object... args){
	for(Object elem:args) {
		System.out.print(elem+ " ");
	}
	System.out.println();
}
}
