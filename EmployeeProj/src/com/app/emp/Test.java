package com.app.emp;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		int add = e.add(10, 20);
		System.out.println("Addition number  " + add);
		
		int div=e.div(25, 5);
		System.out.println("Div number   "+div);
	}
}
