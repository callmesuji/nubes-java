package com.nubes.internship.ReflectionApi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethods {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.nubes.internship.ReflectionApi.Example");
			Method method[] = c.getDeclaredMethods();
			for (Method name : method) {
				System.out.println(name);
				System.out.println("===================================== ");
				System.out.println(Modifier.toString(name.getModifiers()));
				System.out.println(name.getReturnType());
				System.out.println(name.getParameterCount());
				System.out.println(name.getName());
				System.out.println("------------------------------------- ");
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
