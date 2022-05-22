package question1;
import java.util.Scanner;
public class Main {
	
	

	       public static void main(String[] argus) {
			
		
			
			Scanner scan =new Scanner(System.in);
			
	Employee newdata=Employee.getEmployeeDetails();
			
	
			//asking for PF percentage and sending to database
			System.out.println("enter PF percentage");
			int empPf=scan.nextInt();
			newdata.calculateNetSalary(empPf);
			
			//getting data from database about employees id name salary and netsalary;
			int responsId=newdata.getEmployeeId();
			String responsName=newdata.getEmployeeName();
			double responsNetSalary=newdata.getNetSalary();
			double responsSalary=newdata.getSalary();
			
			System.out.println("Id :"+responsId);
			System.out.println("Name :"+responsName);
			System.out.println("Salery :"+responsSalary);
			System.out.println("NetSalery :"+responsNetSalary);
		}
}
