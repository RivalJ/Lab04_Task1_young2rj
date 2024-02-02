public class Main {
    public static void main(String[] args) {

        double purchasePrice = 200.54;
        double TAX_AMOUNT = 0.05;
        double totalPrice = 0.00;
        double salesTax = 0;

        System.out.println("the purchase price is " + purchasePrice);

        salesTax = purchasePrice * TAX_AMOUNT;
        totalPrice = purchasePrice + salesTax;

        System.out.println("the sales tax is " + salesTax);
        System.out.println("the total price is " + totalPrice);

        System.out.printf("sales tax rounded is %6.2f", salesTax);

    }
}