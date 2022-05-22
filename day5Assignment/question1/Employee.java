package question1;

import java.util.Scanner;

public class Employee {
	
	    private    int employeeId ;
	    private   String employeeName ;
	     private  double salary;
	     private  double netSalary ;
	     
	     
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getNetSalary() {
			return netSalary;
		}
		public void setNetSalary(double netSalary) {
			this.netSalary = netSalary;
		}
		
		public Employee() {
			
		}
		 public  void calculateNetSalary(int
				pfpercentage) {
			 double salaryinfo=getSalary();
			 double salarypercent=(double)pfpercentage;
			 double netPfAmount= (salaryinfo*salarypercent)/100;
			 double netInhand=salaryinfo-netPfAmount;
			 
			 setNetSalary(netInhand);
					 
		 }
		 
		 public static Employee getEmployeeDetails() {
				Scanner scan =new Scanner(System.in);

			 Employee employee = new Employee();
			 
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
			 return employee;
		 }
}
