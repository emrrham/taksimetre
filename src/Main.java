import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 3.30, total , StartPrice = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz :");
        km = input.nextInt();
        total = (km * perKm);
        total += StartPrice;
        total = (total<20) ? 20 : total;
        System.out.println("akife giren miktar : " +total);
    }
}