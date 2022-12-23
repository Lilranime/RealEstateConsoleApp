package utility;

import java.util.ArrayList;

public class HouseUtil {
    public static void listHouses(){
        ArrayList<String> houses =new ArrayList<String>();
        houses.add("Self Contain");
        houses.add("One Bedroom");
        houses.add("Two Bedroom");
        houses.add("Three Bedroom");
        for (int singleHouse =0; singleHouse<houses.size(); singleHouse++){
            System.out.println(houses.get(singleHouse));
        }
    }
}
