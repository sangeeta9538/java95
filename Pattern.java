public class Pattern
{
public static void main(String[] args)
{
	int n=5;


for(int i=1; i<=n; i++)
{
	for(int j=1; j<=i; j++)
	{
		System.out.print("* ");
	}
	System.out.println(" ");
	
}
System.out.println("________________________________");

for(int i=1; i<=n; i++)
{
	for(int j=i; j<=n; j++)
	{
		System.out.print("* ");
	}
	System.out.println(" ");
	
}

}
}