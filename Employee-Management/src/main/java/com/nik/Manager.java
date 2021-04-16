package com.nik;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.nik.model.Employee;

public class Manager
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String ch = "";
		do
		{
			EmployeeDao dao = new EmployeeDao();
			Employee employee = null;
			menu();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				employee = new Employee();
				employee.setFirstName("mmm");
				employee.setLastName("kkk");
				employee.setDesignation("Software tester");
				employee.setAge(23);
				employee.setSalary(66666);
				if (validate())
				{
					dao.saveEmployee(employee);
				} else
				{
					System.out.println("validation failed");
				}
				break;
			case 2:
				System.out.println("Enter the id for update");
				int id = sc.nextInt();
				employee = dao.getEmpById(id);
				if (employee != null)
				{
					employee.setFirstName("ddd");
					employee.setAge(78);
					dao.updateEmployee(employee);
				} else
				{
					System.out.println("Employee is not exist with id = " + id);
				}
				break;
			case 3:
				System.out.println("Enter the id for delete");
				employee = dao.getEmpById(sc.nextInt());
				dao.deleteEmployee(employee);
				break;
			case 4:
				System.out.println("coming soon.....");
				break;
			case 5:
				System.out.println("Enter the id for select");
				employee = dao.getEmpById(sc.nextInt());
				System.out.println(employee.getId());
				System.out.println(employee.getAge());
				break;

			default:
				break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			ch = sc.next();

		} while ("Y".equalsIgnoreCase(ch));
		sc.close();
	}

	private static boolean validate()
	{

		return false;

	}

	private static void menu()
	{
		System.out.println("1. create employee");
		System.out.println("2. update employee");
		System.out.println("3. delete employee");
		System.out.println("4. get all employee");
		System.out.println("5. get employee by id");
		System.out.println("6. exist");
	}
}
