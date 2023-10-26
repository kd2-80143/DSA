package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int SearchbyEmpId(Employee[] arr, int size, int key) 
	{
		for(int i = 0; i < size ; i++)
		{
			if(key==arr[i].getEmpid())
			{
				return i;
			}
		}
		return -1;
		
	}
	
	public static int SearchbyName(Employee[] arr, int size, String key)
	{
		for(int i = 0; i < size ; i++)
		{
			if(key.equals(arr[i].getName()))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int SearchbySalary(Employee[] arr, int size, double key)
	{
		for(int i = 0; i < size ; i++)
		{
			if(key == arr[i].getSalary())
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(1,"Abhay",10000.0);
		arr[1] = new Employee(2,"Yash",20000.0);
		arr[2] = new Employee(3,"Saurabh",15000.0);
		arr[3] = new Employee(4,"Ayush",24000.0);
		arr[4] = new Employee(5,"Vidit",12000.0);
		System.out.println("Enter the employee id to search");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		int idindex = SearchbyEmpId(arr,arr.length,key);
		if(idindex != -1)
		{
			System.out.println("Employee found : " + arr[idindex]);
		}
		else
		{
			System.out.println("Employee not found");
		}
		
		System.out.println();
		
		System.out.println("Enter the employee name to search");
		String key1 = sc.next();
		int nameindex = SearchbyName(arr,arr.length,key1);
		if(nameindex != -1)
		{
			System.out.println("Employee found : " + arr[nameindex]);
		}
		else
		{
			System.out.println("Employee not found");
		}
		
		System.out.println();
		
		System.out.println("Enter the employee salary to search");
		Double key2 = sc.nextDouble();
		int salindex = SearchbySalary(arr,arr.length,key2);
		if(salindex != -1)
		{
			System.out.println("Employee found :" +arr[salindex]);
		}
		else
		{
			System.out.println("Employee not found");
		}
		
	}

}
