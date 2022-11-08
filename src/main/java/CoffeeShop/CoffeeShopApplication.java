package CoffeeShop;

import java.util.Scanner;

public class CoffeeShopApplication {
    public static void main(String[] args){
        CoffeeShopService service = new CoffeeShopService();
        System.out.println("Welcome to the coffee shop. How many coffees would you like?");
        //allow the user to order n amount of coffees
        Scanner userInput = new Scanner(System.in);
//        take in a number from the user
        int numberOfCoffees = userInput.nextInt();
        String output = service.getMessageBasedOnNumCoffees(numberOfCoffees);
        System.out.println(output);
//perform different actions depending on what that number is
        System.out.println("Thanks for visiting!");
    }
}
