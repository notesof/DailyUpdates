package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
			System.out.println("5. Search By Id");
			System.out.println("6. Find By Name");
			System.out.println("7. Sort By Name");
			System.out.println("8. Sort By ID");
			System.out.println("9. Exit");
			System.out.println();

			System.out.println("Enter your choice :- ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter Employee Id : ");
				int id = sc.nextInt();

				if (id == 0) {	

					try {
						throw new InvalidDataEcception("Data is not valid");
					}catch(Exception e){
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
				}   

				for (Employee employee2 : arrayList) {
					if (employee2.getEmpId() == id) {
						try {
							throw new EmployeeFoundException("Employee with Id" + id + "already exists");
						} catch (Exception e) {
							System.out.println("Employee with Id " + id + " already exists "+e.getMessage());
						}
					}
				}

				System.out.println("Enter Employee Name : ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter Employee Age : ");
				int age = sc.nextInt();
				System.out.println("Enter Employee Salary : $");
				double salary = sc.nextDouble();

				Employee employee = new Employee(id, name, age, salary);
				arrayList.add(employee);
				System.out.println("Student added successfully");
//				sc.close();
				break;

			case 2:
				if (arrayList.isEmpty()) {
					try {
						throw new EmployeeNotFoundException("No Employee Found");
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("Employee Details are :- ");
					System.out.println("====================");
					System.out.println();
					for (Employee employee2 : arrayList) {
						System.out.println("EmpId :- " + employee2.getEmpId());
						System.out.println("Name :- " + employee2.getName());
						System.out.println("Age :- " + employee2.getAge());
						System.out.println("Salary :- " + employee2.getSalary());
						System.out.println();
					}

				}
				break;

			case 3:
				System.out.println("Enter the EmpId to upadte :- ");
				int updateId = sc.nextInt();

				boolean found = false;
				for (Employee employee2 : arrayList) {
					if (employee2.getEmpId() == updateId) {
						System.out.println("Enter the Updated name :- ");
						sc.nextLine();
						String updateName = sc.nextLine();
						System.out.println("Enter the Updated Age :- ");
						int updateAge = sc.nextInt();
						System.out.println("Enter the Updated Salary :- ");
						double updatedSalary = sc.nextDouble();

						employee2.setName(updateName);
						employee2.setAge(updateAge);
						employee2.setSalary(updatedSalary);

						found = true;
					}
				}
				if (!found) {
					System.out.println("The employee with id " + updateId + " not found");
				}
				break;

			case 4:
				System.out.println("Enter employeeId to delete ;- ");
				int deleteId = sc.nextInt();

				boolean found1 = false;
				Iterator<Employee> iterator = arrayList.iterator();
				while (iterator.hasNext()) {
					Employee employee2 = iterator.next();
					if (employee2.getEmpId() == deleteId) {
						iterator.remove();
					}
					found1 = true;
				}
				if (!found1) {
					System.out.println("Employee with " + deleteId + " not found ");
				}
				break;

			case 5:
				System.out.println("Enter the EmpId :- ");
				int searchId = sc.nextInt();

				for (Employee employee2 : arrayList) {
					if (employee2.getEmpId() == searchId) {
						System.out.println("EmpId :- " + employee2.getEmpId());
						System.out.println("Name :- " + employee2.getName());
						System.out.println("Age :- " + employee2.getAge());
						System.out.println("Salary :- " + employee2.getSalary());
						System.out.println();
					}
				}

				break;

			case 6:
				System.out.println("Enter the Emp Name to Find :- ");
				sc.nextLine();
				String findName = sc.nextLine();

				for (Employee employee2 : arrayList) {
					if (employee2.getName().equals(findName)) {
						System.out.println("EmpId :- " + employee2.getEmpId());
						System.out.println("Name :- " + employee2.getName());
						System.out.println("Age :- " + employee2.getAge());
						System.out.println("Salary :- " + employee2.getSalary());
					}
				}

				break;

			case 7:
				System.out.println("Employee Details sorted BY Name :- ");
				Collections.sort(arrayList, new NameComparator());
				for (Employee employee2 : arrayList) {
					System.out.println("EmpId :- " + employee2.getEmpId());
					System.out.println("Name :- " + employee2.getName());
					System.out.println("Age :- " + employee2.getAge());
					System.out.println("Salary :- " + employee2.getSalary());
					System.out.println();
				}

				break;

			case 8:
				System.out.println("Employee Details sorted By ID :- ");
				Collections.sort(arrayList, new IdComparator());
				for (Employee employee2 : arrayList) {
					System.out.println("EmpId :- " + employee2.getEmpId());
					System.out.println("Name :- " + employee2.getName());
					System.out.println("Age :- " + employee2.getAge());
					System.out.println("Salary :- " + employee2.getSalary());
					System.out.println();
				}

				break;

			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Choose the correct option");
			}
		}

	}

}
