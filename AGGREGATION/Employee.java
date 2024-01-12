public class Employee{
	
	String empId;
	int salary;
	
	
	
	void work(){
		System.out.println("employee works");
	}
	
	
	void goHome(){
		System.out.println("employee goes home");
	}
	
	Employee(String EmpId, int salary){
	  
      this.empId=empId;
      this.salary=salary;	  
		
	
	}
}