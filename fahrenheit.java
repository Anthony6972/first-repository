import java.util.Scanner;

public class fahrenheit{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

     System.out.print("Enter temperature: ");
      double celcius2 = input.nextDouble();

    	double fahrenheit2 =9.0/5.0*celcius2 + 32;
    	 fahrenheit2 = Math.round(fahrenheit2);
          System.out.println(celcius2+" Celcius is "+fahrenheit2+" Fahrenheit");
            Convert.main(null);
  }
}