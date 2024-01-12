public class CompanyRunner{
	public static void main(String args[]){
	
	Manager manager=new Manager("associate", 10);	
		
	Employee employee=new Employee("abc", 150000);
		
	Company company=new Company("TCS", "BANGLORE",employee, manager);
	
	company.employee.work();
	
	//company.manager.checkTask();
	
	Software software=new Software("intst", 1200);
	
	Data data=new Data("skkk", 100);

    It it=new It("build App",15,software,data,"hp","hubli",employee,manager);
    
    it.software.validateInput();
	it.employee.work();
	
	it.data.fetchData();
	
	It it1=new It("buildwebsite",16,software,data,"capgemini","pune",employee,manager);
	
	it1.manager.giveTask();

	
	Accounting accounting=new Accounting("sk",150);
	
	//System.out.println(it.projectName);

	Quality quality=new Quality("laptop", 350);

    Bpo bpo=new Bpo("xyz", 100,  accounting, quality);

    bpo.accounting.creditAccount();
	
	bpo.quality.analyzeFeedback();
	
	 Bpo bpo1=new Bpo("pqr", 200,  accounting, quality);
	 
	 bpo1.accounting.debitAccount();

		
		
		
		
		
		
	}
	
	
	
	
}