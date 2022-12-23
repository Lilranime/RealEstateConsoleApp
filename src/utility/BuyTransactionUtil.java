package utility;

import java.util.Scanner;

public class BuyTransactionUtil {
    public static void userInput(){
        Scanner nextPage = new Scanner(System.in);
        MessageUtil.messageToUser("Input N to go to the next page");
        nextPage.nextLine().toUpperCase();
        if (nextPage.equals("N"));
        MessageUtil.messageToUser("These are the house available");
        HouseUtil.listHouses();
    }
}
