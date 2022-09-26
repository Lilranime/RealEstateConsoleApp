package utility;

public class MessageUtil {
    public static void messenger(String welcome){
        System.out.println(welcome);
    }

    public static void writeInstruction(String instruction){
        System.out.println(instruction);
    }

    public static void giveUserFeedback(String selectedHouseName, int housePrice){
        System.out.println("You just purchased " + selectedHouseName + " at " + housePrice);
    }
    public static void giveUserSalesFeedback(String HouseName, int housePrice){
        System.out.println("House: "+HouseName+"\nPrice: "+ housePrice+"\nSold successfully\nNice doing business with you.");
    }
}
