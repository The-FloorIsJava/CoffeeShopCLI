package CoffeeShop;

public class CoffeeShopService {
    /**
     * get a message depending on the number of coffees
     * @param numberOfCoffees number of coffees
     * @return "you ordered x coffees" if number of coffees is positive and "invalid action" if its negative
     */
    public String getMessageBasedOnNumCoffees(int numberOfCoffees){
        if(numberOfCoffees > 0){
            return "You ordered " + numberOfCoffees + " coffees";
        }else if(numberOfCoffees == 0){
            return "exit";
        }else{
            return "Invalid action";
        }
    }
    /**
     * to determine if we should end the coffee shop application,
     * let's return true if coffee input is 0
     * and false otherwise
     *
     * @param numberOfCoffees number of coffees generated from user input
     * @return true if numberOfCoffees is 0, false otherwise
     */
    public boolean shouldMenuExit(int numberOfCoffees){
        if(numberOfCoffees == 0){
            return true;
        }else{
            return false;
        }
    }
}
