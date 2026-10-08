package facadePattern;
public class FrontDesk {

    private Valet v;
    private HouseKeeping hk;
    private Cart c;

    public FrontDesk() {
        v = new Valet();
        hk = new HouseKeeping();
        c = new Cart();
    }

    public void pickUpVehicle(String plateNumber) {
        v.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        hk.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        c.requestCart(numberOfCarts);
    }
}