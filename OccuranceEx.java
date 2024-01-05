public class OccuranceEx
{
 public static void main(String[]args)
 {
	 String str = "Sangeeta";             
	 char[] charArray = str.toCharArray();
	 System.out.println(charArray);
	 
	 for(int i=charArray.length-1; i>=0; i--)
	 {
		 System.out.println(charArray[i]);
	 }
	 
	OccuranceEx obj = new OccuranceEx();
	int occurence = obj.countOccurence(charArray,'a');
	System.out.println("Occurence of 'a' :" +occurence);
	
 }
    public int countOccurence(char[] charArray, char ch)