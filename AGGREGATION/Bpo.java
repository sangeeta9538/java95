public class Bpo{
	
	String clientName;
	int taskQueue;
	Accounting accounting;
	Quality quality;
	
	
	
	void startProcess(){
		System.out.println("starts the work process");
	}
	
	
	void updateSLA(){
		System.out.println("updating SLA");
	}
	
	Bpo(String clientName, int taskQueue, Accounting accounting,Quality quality)
    {
	  
      this.clientName=clientName;
      this.taskQueue=taskQueue;	
      this.accounting=accounting;
      this.quality=quality;	  
	}
}