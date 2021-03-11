package facade.travel;

/**
 * 旅行社
 */
public class TravelAgency {

    Airline airline = new Airline();
    Hotel hotel = new Hotel();
    Restaurant restaurant = new Restaurant();
    Attraction attraction = new Attraction();

    /**
     * 低端套餐
     */
    public void lowEndPackage() {
        System.out.println("低端套餐：");
        // 坐经济舱
        airline.economyClass();
        // 住民宿
        hotel.homestay();
        // 吃大排档
        restaurant.foodStall();
        // 去水族馆
        attraction.aquarium();
        // 去风景区
        attraction.scenicArea();
    }

    /**
     * 中端套餐
     */
    public void midRangePackage() {
        System.out.println("中端套餐：");
        // 坐经济舱
        airline.economyClass();
        // 住四星级酒店
        hotel.fourStarHotel();
        // 吃火锅
        restaurant.hotPot();
        // 去博物馆
        attraction.museum();
        // 去水族馆
        attraction.aquarium();
        // 去风景区
        attraction.scenicArea();
    }

    /**
     * 高端套餐
     */
    public void highEndPackage() {
        System.out.println("高端套餐：");
        // 坐商务舱
        airline.businessClass();
        // 住五星级酒店
        hotel.fiveStarHotel();
        // 吃西餐厅
        restaurant.westernRestaurant();
        // 去博物馆
        attraction.museum();
        // 去水族馆
        attraction.aquarium();
        // 去风景区
        attraction.scenicArea();
        // 参观摩天大楼
        attraction.skyscrapers();
    }

}
