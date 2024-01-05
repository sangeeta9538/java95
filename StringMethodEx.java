public class StringMethodEx{
    public static void main(String[] args) {
  
       String emptyString = "";
        System.out.println("isEmpty(): " + emptyString.isEmpty());

      
        String stringWithSpaces = "   Trim Me   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Original String: '" + stringWithSpaces + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");

        
        double number = 123;
        String numberString = String.valueOf(number);
        System.out.println("valueOf(): " + numberString);

       
        String originalString = "Hello, World!";
        String substring = originalString.substring(7);
        System.out.println("substring(): " + substring);

        String replaceString = "apple apple orange";
        String replacedString = replaceString.replaceFirst("apple", "banana");
        System.out.println("replaceFirst(): " + replacedString);

        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

        String file = "example.txt";
        System.out.println("endsWith('.txt'): " + file.endsWith(".txt"));
        System.out.println("startsWith('example'): " + file.startsWith("example"));

        String mixedCaseString = "MixED CaSe StRINg";
        System.out.println("toUpperCase(): " + mixedCaseString.toUpperCase());
        System.out.println("toLowerCase(): " + mixedCaseString.toLowerCase());
    }
}
