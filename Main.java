import java.util.Scanner;
/**
 * a program that writes a line of * each time for a user entered number
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    int n = input.nextInt();

    // create a for loop
    for(int count = 1; count <= n; count++){
      System.out.print("*");
    }
    
  }
}
