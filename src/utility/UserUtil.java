package utility;

import java.util.Scanner;

public class UserUtil {

    public static void sellHouse(){
        MessageUtil.messenger("Please Input info about house");
        Scanner takeInputOfUser = new Scanner(System.in);
        MessageUtil.messenger("Name of the house: ");
        String userSellingInfo = takeInputOfUser.nextLine();
        MessageUtil.messenger("Input price of the house: ");
        int userSellingPrice = takeInputOfUser.nextInt();
        MessageUtil.giveUserFeedback(userSellingInfo,userSellingPrice);

    }
}
