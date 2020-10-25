import java.util.Scanner;

public class TicketCreator {
    Scanner scanner = new Scanner(System.in);
    public Ticket create(Address address) {
        System.out.println("Szczegóły wydarzenia: ");
        System.out.println("Podaj nazwę wydarzenia: ");
        String nameOfEvent = scanner.nextLine();
        Address placeOfEvent = new Address(address.getCity(), address.getStreet());
        System.out.println("Wybierz typ biletu: ");
        System.out.println("1 - online");
        System.out.println("2 - standard");
        System.out.println("3 - gift");
        TicketType type = chooseType(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj podstawową cenę biletu: ");
        double basicPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj wielkość (0-1) otrzymanego rabatu: ");
        double discount = scanner.nextDouble();
        scanner.nextLine();

        return new Ticket(nameOfEvent, placeOfEvent, type, basicPrice, discount);
    }

    public TicketType chooseType(int option) {
        return switch (option) {
            case 1 -> TicketType.ONLINE;
            case 2 -> TicketType.STANDARD;
            case 3 -> TicketType.GIFT;
            default -> TicketType.NONE;
        };
    }
}
