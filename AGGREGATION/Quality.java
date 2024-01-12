public class Quality{
	
	String itemName;
	int defectRate;
	
	
	
	void analyzeFeedback(){
		System.out.println("analyzing customer feedback");
	}
	
	
	void escalateQualityConcern(){
		System.out.println("escalating quality concern");
	}
	
	Quality(String itemName, int defectRate){
	  
      this.itemName=itemName;
      this.defectRate=defectRate;	  
		
	
	}
}