package facadePattern;
public class HouseKeeping implements HotelService {

    @Override
    public void service() {
        System.out.println("Housekeeping service is ready.");
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }
}