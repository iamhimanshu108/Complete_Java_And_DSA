package JavaBroCode.Day06Cart;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        //Shopping Cart

        Scanner sc = new Scanner(System.in);

        String item;

        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you Like To buy? ");
        item =sc.nextLine();
        System.out.println("What is the price for each ? : ");
        price=sc.nextDouble();
        System.out.println("How many would you like?: ");
        quantity=sc.nextInt();
        total = price * quantity;

        System.out.println("\n You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
        sc.close();
    }
}
