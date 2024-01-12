public class Company{
	
	String name;
	String location;
	Employee employee;
	Manager manager;
	
	
	
	void makeBranches(){
		System.out.println("company make branches");
	}
	
	
	void buildBusiness(){
		System.out.println("company builds business");
	}
	Company(){
		
		
	}
	
	Company(String name,String location,Employee employee,	Manager manager)
    {
	  
      this.name=name;
      this.location=location;	
      this.employee=employee;
      this.manager=manager;	  
		
	
	}
}