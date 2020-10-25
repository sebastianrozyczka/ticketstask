public class Application {
    public static void main(String[] args) {
        AddressCreator addressCreator = new AddressCreator();
        TicketCreator ticketCreator = new TicketCreator();
        PriceCalculator priceCalculator = new PriceCalculator();
        Ticket[] tickets = new Ticket[3];

        Address[] addresses = new Address[2];
        addresses[0] = addressCreator.create();

        tickets[0] = ticketCreator.create(addresses[0]);
        tickets[1] = ticketCreator. create(addresses[0]);
        tickets[2] = ticketCreator.create(addresses[0]);

        tickets[0].getInfoAboutTicket();
        System.out.println("Cena biletu to: " + priceCalculator.calculatePrice(tickets[0]));
        tickets[1].getInfoAboutTicket();
        System.out.println("Cena biletu to: " + priceCalculator.calculatePrice(tickets[0]));
        tickets[2].getInfoAboutTicket();
        System.out.println("Cena biletu to: " + priceCalculator.calculatePrice(tickets[0]));
    }
}
