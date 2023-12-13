package com.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCRUD {

	public static void main(String[] args) {

		ArrayList<Employee> arrayList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		

		while (true) {
			System.out.println("1. Add Employee");
			System.out.println("2. Get Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println();
			
			
			System.out.println("Enter your choice :- ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				System.out.println("Enter Employee Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name : ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Employee Age : ");
				int age = sc.nextInt();
				System.out.println("Enter Employee Salary : $");
				double salary = sc.nextDouble();

				Employee employee=new Employee(id, name, age, salary);
				arrayList.add(employee);
				System.out.println("Student added successfully");
//				sc.close();
				break;

			case 2:
				if (arrayList.isEmpty()) {
					System.out.println("No employee is present");
				} else {
					System.out.println("Employee Details are :- ");
					System.out.println("====================");
					System.out.println();
					for (Employee employee2:arrayList) {
						System.out.println("EmpId :- " + employee2.getEmpId());
						System.out.println("Name :- " + employee2.getName());
						System.out.println("Age :- " + employee2.getAge());
						System.out.println("Salary :- " + employee2.getSalary());
						System.out.println();
					}

				}
			}
		}

	}

}
