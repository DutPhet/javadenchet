import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prin;
        float air;
        byte years;
        do {
            System.out.print("Principal ($1K - $1M): ");
            prin = scan.nextInt();
            if (prin >= 1000 && prin <= 1000000){
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while (prin < 1000 || prin > 1000000);
        do {
            System.out.print("Annual Interest Rate: ");
            air = scan.nextFloat();
            if (air > 0 && air <= 30){
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        while (air <= 0 || air > 30);
        do {
            System.out.print("Period (Years): ");
            years = scan.nextByte();
            if (years > 0 && years <= 30){
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        while (years <= 0 || years > 30);
        double mortNum = (prin * 0.01*air * Math.pow((1+0.01*air/12), years * 12)) / ((12* Math.pow((1+0.01 *  air / 12), years * 12)) - 12);
        String mortform = NumberFormat.getCurrencyInstance().format(mortNum);
        System.out.print("Morgage: " + mortform);
    }
}
