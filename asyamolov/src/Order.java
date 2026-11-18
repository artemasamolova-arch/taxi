public class Trip {
    private final int id;

private final User user;
    private final Location From;
    private final Location to;
    private Driver assignDriver;
    private OrderStatus status = TripStatus.NEW;
    private double price;

    Trip(User user,Location from,Location to){
        this.user = user;
        this.from = from;
        this.to = to;
    }
    public enum TripStatus { NEW, ASSIGNED, IN_PROGRESS, FINISHED, CANCELED };
    Driver getAssignDriver()
    {
        return assignDriver;
    }
    OrderStatus getStatus()
    {
        return status;
    }
    Location getDrom()
    {
        return from;
    }
    Location getTo()
    {
        return to;
    }
    void assignDriver(Driver d)
    {}
    void setStatus(OrderStatus s)
    {

    }
    void setPrice(double price)
    {

    }
}
