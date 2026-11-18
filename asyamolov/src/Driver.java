public class Driver extends Person {
    public enum DriverStatus { FREE, ON_ORDER, OFFLINE };
    private final Car car;

    Driver(String name,String phone, Car car)
    {
        super(name, phone);
    }

}
