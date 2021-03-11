package facade.travel;

/**
 * 跟团旅游
 */
public class GroupTravel {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        // 低端套餐
        travelAgency.lowEndPackage();
    }
}
