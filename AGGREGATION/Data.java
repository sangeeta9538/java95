public class Data{
	
	String typeOfData;
	int indexOfData;
	
	
	
	void provideData(){
		System.out.println("providing data");
	}
	
	
	void fetchData(){
		System.out.println("fetching data");
	}
	
	Data(String typeOfData,int indexOfData){
	  
      this.typeOfData=typeOfData;
      this.indexOfData=indexOfData;	  
		
	
	}
}