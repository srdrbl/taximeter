import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, perKm = 2.20, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the distance in kilometers: ");
        km = input.nextDouble();

        total = 10 + (km * perKm);
        total = total < 20 ? 20 : total;
        System.out.println(total);
    }
}
