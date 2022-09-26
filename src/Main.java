import modelclasses.House;
import utility.HouseUtil;
import utility.MessageUtil;
import utility.OrderUtil;
import utility.UserUtil;

import java.util.List;
import java.util.Scanner;

import static utility.HouseUtil.displayInitializedStoredHouses;

public class Main {
    public static void main(String[] args) {
     Scanner takeUserInput=new Scanner(System.in);
     String userInput;
     List<House> houseList= HouseUtil.getHouseList();
     MessageUtil.messenger("Hello, Welcome\n");
     MessageUtil.messenger("Are you a seller or Buyer [B-Buyer/S-Seller]");
     userInput=takeUserInput.nextLine().toUpperCase();
     if(!userInput.equals("")){
      if(userInput.equals("B")){
       MessageUtil.writeInstruction("Please select the house you would like to buy below\n");
       displayInitializedStoredHouses();
       OrderUtil.performHouseSale();
      }else if (userInput.equals("S")){
       UserUtil.sellHouse();

 }

    }
}
}
