package day5Assignment;

import java.util.Scanner;

public class Main {
  
	
	public static void main(String[] argus) {
		
		Employee employee= new Employee();
		
		Scanner scan =new Scanner(System.in);
		
		//asking for id and sending to database
		System.out.println("enter id");
		int empid=scan.nextInt();
		employee.setEmployeeId(empid);
		
		//asking for name and sending to database
		scan.nextLine();
		System.out.println("enter Name");
		String empName=scan.nextLine();
		employee.setEmployeeName(empName);
		
		//asking for Salary and sending to database;
		System.out.println("enter Salery");
		double empSalery=scan.nextInt();
		employee.setSalary(empSalery);
		
		//asking for PF percentage and sending to database
		System.out.println("enter PF percentage");
		int empPf=scan.nextInt();
		employee.calculateNetSalary(empPf);
		
		//getting data from database about employees id name salary and netsalary;
		int responsId=employee.getEmployeeId();
		String responsName=employee.getEmployeeName();
		double responsNetSalary=employee.getNetSalary();
		double responsSalary=employee.getSalary();
		
		System.out.println("Id :"+responsId);
		System.out.println("Name :"+responsName);
		System.out.println("Salery :"+responsSalary);
		System.out.println("NetSalery :"+responsNetSalary);
	}
}
