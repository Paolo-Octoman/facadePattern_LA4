package facadePattern;
public class HotelApp {

    public static void main(String[] args) {

        FrontDesk fd = new FrontDesk();

        fd.pickUpVehicle("CCS-2014");

        fd.cleanRoom(110);

        fd.requestCart(4);
    }
}