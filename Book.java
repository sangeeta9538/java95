public class Book{

   String bookName;
   int numberOfPages;
   String author;
   int price;
   int publishedYear;
   String publisher;
   String bookType;
   
   Book(String bookName,int numberOfPages,String author,int price, int publishedYear,String publisher,String bookType){
	   this.bookName=bookName;
	   this.numberOfPages=numberOfPages;
	   this.author=author;
	   this.price=price;
	   this.publishedYear=publishedYear;
	   this.publisher=publisher;
	   this.bookType=bookType;
   }
   void printBookDetails(){
	   
	System.out.println("book name :" + bookName ); 
    	System.out.println("no of pages :" + numberOfPages );   
	System.out.println("author :" + author );   
	System.out.println("price   :" + price );   
	System.out.println("publishedYear :" + publishedYear );   
	System.out.println("publisher :" + publisher );   
	System.out.println("type  :" +  bookType );   
	
	}
	
	public static void main(String args[]){
		
		
		Book book1=new Book("coco", 250,"harry",500,2015, "West land" , "disney");
				Book book2=new Book("deniss", 280,"harry",500,2015, "West land" , "disney");
		Book book3=new Book("memory", 250,"richi",500,2015, "West land" , "disney");
		Book book4=new Book("hustle", 250,"joe",500,2015, "West land" , "disney");
		Book book5=new Book("time to kill", 250,"franc",500,2015, "West land" , "disney");
		Book book6=new Book("happy place", 250,"michel",500,2015, "West land" , "disney");
		Book book7=new Book("mindfullness", 250,"jonh",500,2015, "West land" , "disney");

	book1.printBookDetails();
		book2.printBookDetails();
	book3.printBookDetails();
	book4.printBookDetails();
	book5.printBookDetails();
	book6.printBookDetails();
	book7.printBookDetails();

	
		
	}
	   
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
   
   
   