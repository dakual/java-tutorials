import java.util.Scanner;

public class App 
{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int total = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            total += number;
        }
        
        System.out.println("Total: " + total);
        scanner.close();
    }
}
