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
	book1.printBookDetails();
		
	}
	   
	   
	   
	   
	   
	   
   }
   
   
   
   
   
   
   
   
   
   