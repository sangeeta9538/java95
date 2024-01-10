public class StringExample
{
 public static void main(String[]args)
  {
	  
   // Literals  
	  
   String Name = "sk"; 
   System.out.println(Name);
   
   String fruitColour = "Yellow";
   System.out.println(fruitColour);

   String colourOfFruit = "Yellow";
   System.out.println(colourOfFruit);
   
   String email = "sk20@gmail.com";
   email = "sk20@gmail.com";  // re_assigning
   System.out.println(email);
   
   String jobTitle = "Software Engineer";
   jobTitle = "Software Developer";
   System.out.println(jobTitle);
   
   String socialMedia = "FaceBook";
   socialMedia = "Instagram";
   System.out.println(socialMedia);
   
   String city = "Bengaluru";
   System.out.println(city);
   
   String univercityName = "Bengaluru City Univercity";
   univercityName = "Bengaluru North Univercity";
   System.out.println(univercityName);
   
   String weather = "Cloudy";
   System.out.println(weather);
   
   String paymentMode = "Online";
   paymentMode = "Offline";
   System.out.println(paymentMode);
   
   String paymentType = "Offline";
   System.out.println(paymentType);
   
   String mobileBrandName = "Samsung";
   mobileBrandName = "Oppo";
   System.out.println(mobileBrandName);
   
   
   
   //using new keyword
   
   String season = new String("Winter"); 
   season = "Summer";  // re_assigning
   System.out.println(season);
   
   String foodType = new String("veg");
   foodType = "non veg";
   System.out.println(foodType);
   
   String collegeName = new String("BCU");
   collegeName = "Shree Maruthi PU College";
   System.out.println(collegeName);
   
   String location = new String("BTM");
   location = "BTM";
   System.out.println(location);
   
   String caste  = new String("Gowdas");
   caste = "Lingayaths";
   System.out.println(caste);
   
   String codingLanguage = new String("Java");
   codingLanguage = "Python";
   System.out.println(codingLanguage);
   
   String language = new String("Python");
   
   String weatherCondition = new String("Winter");
   weatherCondition = "Summer";
   System.out.println(weatherCondition);
   
   String univercity= new String("Bengalueu North Univercity");
   System.out.println(univercity);
   
   String gender= new String("female");
   System.out.println(gender);
   
   String  subject = new String("Mathametics");
   System.out.println(subject);
  
  
   
   // Comparision
   
   System.out.println(paymentMode==paymentType);
   
   System.out.println(codingLanguage==language);
   
   System.out.println(univercityName==univercity);
   
   System.out.println(weatherCondition==weather);
   
   System.out.println(fruitColour==colourOfFruit);
   }
}