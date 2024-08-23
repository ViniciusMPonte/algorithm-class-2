import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double quantity1, quantity2, quantity3;
        double value1, value2, value3;
        double subTotal1, subTotal2, subTotal3;
        double total;

        System.out.print("\nDigite quantidade 1: ");
        quantity1 = scanner.nextDouble();
        System.out.print("\nDigite valor 1: ");
        value1 = scanner.nextDouble();

        System.out.print("\nDigite quantidade 2: ");
        quantity2 = scanner.nextDouble();
        System.out.print("\nDigite valor 2: ");
        value2 = scanner.nextDouble();

        System.out.print("\nDigite quantidade 3: ");
        quantity3 = scanner.nextDouble();
        System.out.print("\nDigite valor 3: ");
        value3 = scanner.nextDouble();

        subTotal1 = quantity1 * value1;
        subTotal2 = quantity2 * value2;
        subTotal3 = quantity3 * value3;
        total = subTotal1 + subTotal2 + subTotal3;

        System.out.println("\nSubtotal 1: " + subTotal1);
        System.out.println("Subtotal 2: " + subTotal2);
        System.out.println("Subtotal 3: " + subTotal3);
        System.out.println("\nTotal: " + total);
        
        scanner.close();
        
    }    

}