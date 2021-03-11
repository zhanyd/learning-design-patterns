package facade.travel;

/**
 * 自己旅游
 */
public class SelfTravel {
    public static void main(String[] args) {
        Airline airline = new Airline();
        Hotel hotel = new Hotel();
        Restaurant restaurant = new Restaurant();
        Attraction attraction = new Attraction();

        // 坐经济舱
        airline.economyClass();
        // 住民宿
        hotel.homestay();
        // 吃大排档
        restaurant.foodStall();
        // 去博物馆玩
        attraction.museum();
        // 去水族馆
        attraction.aquarium();
        // 去风景区玩
        attraction.scenicArea();
    }
}
