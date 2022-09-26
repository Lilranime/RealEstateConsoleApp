package utility;

import modelclasses.House;

import java.util.Scanner;

public class OrderUtil {
    public static void performHouseSale() {
        Scanner takeInput = new Scanner(System.in);
        Scanner selectHouse = new Scanner(System.in);
        Scanner makeDecision = new Scanner(System.in);
        int selection = selectHouse.nextInt();
        House selectedHouse = HouseUtil.getSingleHouse(HouseUtil.getHouseList(), selection - 1);
        String houseName = ((House) selectedHouse).getHouseName();
        int housePrice = selectedHouse.getHousePrice();
        System.out.println("You selected " + houseName + " which costs: NGN " + housePrice + ". Do you want to continue? [Y-Yes/N-No]");
        String userDecision = makeDecision.nextLine().toUpperCase();

        if (!userDecision.equals("")) {
            if (userDecision.equals("Y")) {
                MessageUtil.giveUserFeedback(selectedHouse.getHouseName(), selectedHouse.getHousePrice());
            } else if (userDecision.equals("N")) {
                MessageUtil.messenger("");
            } else {
                MessageUtil.messenger("Wrong input, please selected a House again: ");
                performHouseSale();
            }
            makeDecision.close();
        }
    }

}
