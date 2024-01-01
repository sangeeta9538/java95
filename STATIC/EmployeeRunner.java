public class EmployeeRunner
{

public static void main(String[] args)
{
  Employee obj=new Employee("avika","sd",24,2500);
  obj.details(); // non-static method invoking
  
  Employee.detail(); // static method invoking

}
}