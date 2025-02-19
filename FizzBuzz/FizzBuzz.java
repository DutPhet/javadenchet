import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FizzBuzz {
    public static void main (String[] args){
        System.out.print("Number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 5 == 0){
            System.out.print("Fizz");
        }
        if (num % 3 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(num);
        }
    }
}