public class Software{
	
	String softwareName;
	int expenses;
	
	
	
	void validateInput(){
		System.out.println("software validates input");
	}
	
	
	void saveUserData(){
		System.out.println("software saves user data");
	}
	
	Software(String softwareName,int expenses){
	  
      this.softwareName=softwareName;
      this.expenses=expenses;	  
		
	
	}
}