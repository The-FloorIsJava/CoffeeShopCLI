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
        }else{
            return "Invalid action";
        }
    }
}
