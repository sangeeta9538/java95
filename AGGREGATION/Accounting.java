public class Accounting{
	
	String accountName;
	int accountBalance;
	
	
	
	void debitAccount(){
		System.out.println("debit ammount from account");
	}
	
	
	void creditAccount(){
		System.out.println("credit ammount to account");
	}
	
	Accounting(String accountName,int accountBalance){
	  
      this.accountName=accountName;
      this.accountBalance=accountBalance;	  
		
	
	}
}