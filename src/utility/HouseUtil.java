package utility;

import modelclasses.House;

import java.util.ArrayList;
import java.util.List;

public class HouseUtil {
    public static List<House> getHouseList(){
        List<House> houses = new ArrayList<>();
        houses.add(new House(1, "Tarila's House", "Akenfa", 1200000000,2,
                1, 1, 2,
                3, true));
        houses.add(new House(2, "Gabriel's House", "Tombia", 130000000,6,
                4, 5, 4, 5,
                false));
        houses.add(new House(3, "Timi", "Agudama", 45000000, 6,
                4, 5, 4, 5,
                false));
        houses.add(new House(4, "Gabriel", "Edepie", 92000000, 6,
                4, 5, 4, 5,
                false));
        houses.add(new House(5, "James", "Okutukutu", 12550000,6,
                4, 5, 4, 5,
                false));
        return houses;
    }

    public static House getSingleHouse(List<House> houseList, int houseId){
        House singleHouse;
        singleHouse = houseList.get(houseId);
        return singleHouse;
    }

    public static void displayInitializedStoredHouses(){
        for (House currentHouse : HouseUtil.getHouseList()) {
            System.out.println(currentHouse.getId() + ". " + currentHouse.getHouseName() + " (" + currentHouse.getHousePrice() + ")");
        }
    }

    public static House getSingleHouse(String houseName, int housePrice) {
        return getSingleHouse(houseName,housePrice);
    }
}



