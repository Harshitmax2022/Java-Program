package question1;

public class Main {

	
	
	
	public static void main(String[] args) {
		Manager manager =new Manager();
		  
		manager.setAddress("Lucknow");
		manager.setAge(25);
		manager.setName("Amit");
		manager.setPhoneNumber("3434344");
		manager.setSalary(50000);
		manager.setDepartment("HR");
		manager.setSpecialisation("Man Management");
		
	   Employee employee = new Employee();
	   employee.setAddress("Delhi");
	   employee.setAge(23);
	   employee.setName("Adi");
	   employee.setPhoneNumber("67457467657");
	   employee.setSalary(40000);
	   manager.setDepartment("IT");
		manager.setSpecialisation("Backend Developer");
	
	   System.out.println(manager.getName());
	   System.out.println(manager.getAge());
	   System.out.println(manager.getPhoneNumber());
	   System.out.println(manager.getAddress());
	   System.out.println(manager.getDepartment());
	   System.out.println(manager.getSpecialisation());
	   
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	   
	   System.out.println(employee.getName());
	   System.out.println(employee.getAge());
	   System.out.println(employee.getAddress());
	   System.out.println(employee.getPhoneNumber());
	   System.out.println(employee.getDepartment());
	   System.out.println(employee.getSpecialisation());
	   
	}
}
