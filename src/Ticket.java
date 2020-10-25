public class Ticket {
    private String nameOfEvent;
    private Address placeOfEvent;
    private TicketType type;
    private double basicPrice;
    private double discount;
    private static int id;

    public Ticket(String nameOfEvent, Address placeOfEvent, TicketType type, double basicPrice, double discount) {
        this.nameOfEvent = nameOfEvent;
        this.placeOfEvent = placeOfEvent;
        this.type = type;
        this.basicPrice = basicPrice;
        this.discount = discount;
        id++;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public Address getPlaceOfEvent() {
        return placeOfEvent;
    }

    public void setPlaceOfEvent(Address placeOfEvent) {
        this.placeOfEvent = placeOfEvent;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static int getId() {
        return id;
    }

    public String getInfoAboutTicket() {
        return "Wydarzenie: " + nameOfEvent + ", które odbywa się w mieście: "
                + placeOfEvent.getCity() + " na ulicy " + placeOfEvent.getStreet()
                + ". Typ biletu: " + type + ".";
    }
}
