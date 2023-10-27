package com.sunbeam;

import java.util.Arrays;

public class Tester {

	public static void insertionsortempsal(Employee emp[],int N)
	{
		for(int i=1 ; i<N; i++)
		{
			int j;
			Employee temp = emp[i];
			for(j=i-1; j>=0;j--)
			{
				if(emp[j].getSalary() > temp.getSalary())
				{
					emp[j+1] = emp[j];
				}
				else
				{
					break;
				}
			}
			emp[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(101,"Abhay",20000.0);
		emp[1] = new Employee(201,"Ayush",30000.0);
		emp[2] = new Employee(301,"Yash",10000.0);
		emp[3] = new Employee(401,"Vidit",25000.0);
		emp[4] = new Employee(501,"Madhur",15000.0);
		
		System.out.println("Arrays before sort : " +Arrays.toString(emp));
		insertionsortempsal(emp,emp.length);
		System.out.println("Arrays before sort : " +Arrays.toString(emp));
	}

}
