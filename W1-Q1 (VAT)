import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double vatRate, priceWithoutVat, priceWithVat;

        System.out.println("Enter VAT rate:");
        vatRate = scan.nextDouble();

        System.out.println("Enter price without VAT:");
        priceWithoutVat = scan.nextDouble();

        double vatAmount = (vatRate * priceWithoutVat) / 100;
        priceWithVat = priceWithoutVat + vatAmount;

        System.out.println("Price without VAT: " + priceWithoutVat + " TL");
        System.out.println("VAT Rate: %" + vatRate);
        System.out.println("VAT Amount: " + vatAmount + " TL");
        System.out.println("Price with VAT: " + priceWithVat + " TL");
    }
}
