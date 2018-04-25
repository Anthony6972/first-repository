import java.util.Scanner;

public class celsius{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  System.out.print("Enter temperature: ");
        double fahrenheit1 = input.nextDouble();

        double celcius1 =5.0/9.0*(fahrenheit1 - 32);
        celcius1 = Math.round(celcius1);
    System.out.println(fahrenheit1+" Fahrenheit is "+celcius1+" Celcius");
Convert.main(null);
  }
}