public class It extends Company{
	
	String projectName;
	int revenue;
	Software software;
	Data data;
	
	
	
	void sendEmail(){
		System.out.println("sends mail");
	}
	
	
	void generateReport(){
		System.out.println("generates report");
	}
	 It()
	{
		
		
	}
	
	It(String projectName, int revenue, Software software,Data data,String name,String location,Employee employee,	Manager manager)

    {
	  
      this.projectName=projectName;
      this.revenue=revenue;	
      this.software=software;
      this.data=data;
      this.name=name;
      this.location=location;
      this.employee=employee;
      this.manager=manager;	  
	  
		
	
	}
}