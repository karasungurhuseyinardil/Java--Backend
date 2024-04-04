import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vatRate = 0, priceWithoutVat, priceWithVat;

        System.out.println("Enter the price without VAT");
        priceWithoutVat = scan.nextDouble();

        if (priceWithoutVat >= 0 && priceWithoutVat <= 1000) {
            vatRate = 10.0;
        } else if (priceWithoutVat > 1000) {
            vatRate = 22.0;
        } else {
            System.out.println("Please enter a valid value.");
            return; // Terminate the program if an invalid value is entered
        }

        double vatAmount = vatRate * priceWithoutVat / 100;
        priceWithVat = priceWithoutVat + vatAmount;

        System.out.println("Price Without VAT: " + priceWithoutVat + " TL");
        System.out.println("VAT Rate: %" + vatRate);
        System.out.println("VAT Amount: " + vatAmount + " TL");
        System.out.println("Price With VAT: " + priceWithVat + " TL");
    }
}
