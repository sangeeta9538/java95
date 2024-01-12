public class Manager{
	
	String designation;
	int workHours;
	
	
	
	void giveTask(){
		System.out.println("manager gives task");
	}
	
	
	void checkTask(){
		System.out.println("manager checks task");
	}
	
	Manager(String designation, int workHours){
	  
      this.designation=designation;
      this.workHours=workHours;	  
		
	
	}
}