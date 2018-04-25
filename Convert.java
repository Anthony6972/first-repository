
import java.util.Scanner;

public class Convert{
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);

  System.out.println("1. Fahrenheit to Celsius");
  System.out.println("2. Celsius to Fahrenheit");
  System.out.println("3. Exit");

  System.out.print("Choice: ");
  int choice = input.nextInt();
  switch(choice){
	  case 1:
	  System.out.println("Fahrenheit to Celsius");
	  celsius.main(null); //links to celcius.java which uses simple maths equation for converting temperature.
      break;

      case 2:
	  System.out.println("Celsius to Fahrenheit");
	  fahrenheit.main(null);//links to fahrenheit.java which uses simple maths equation for converting temperature.
      break;

      case 3:
	  System.out.println("Program closed.");
      break;
      default:
	  System.out.println("Invalid choice");
      break;
    }
    System.out.println();
    Index.main(null);
  }
}
