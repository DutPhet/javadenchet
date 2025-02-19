import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        System.out.print("Principal: ");
        Scanner scan = new Scanner(System.in);
        int prin = scan.nextInt();
        System.out.print("Annual Interest Rate: ");
        double air = scan.nextDouble();
        System.out.print("Period (Years): ");
        byte years = scan.nextByte();
        double mortNum = (prin * 0.01*air * Math.pow((1+0.01*air/12), years * 12)) / ((12* Math.pow((1+0.01 *  air / 12), years * 12)) - 12);
        String mortform = NumberFormat.getCurrencyInstance().format(mortNum);
        System.out.print("Morgage: " + mortform);

    }
}
