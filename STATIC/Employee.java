public class Employee
{
static  String companyName;
static String ceo;
String employeeName;
String designation;
int id;
int salary;

  Employee(String employeeName,String designation,int id,int salary) // non-static variables initialzation
  {
      this.employeeName=employeeName;
	  this.designation=designation;
	  this.id=id;
	  this.salary=salary;
  }
   static  // static variables initialzation
   {
       companyName="abc";
       ceo="jon";
       
  }
  
  void details() // non static method
  {
	  System.out.println(employeeName);
	  System.out.println(designation);
	  System.out.println(id);
	  System.out.println(salary);
	  
}
static void detail()  //static method
{
	  System.out.println("static= "+companyName);
	  System.out.println("static= "+ceo);
  }
	

}