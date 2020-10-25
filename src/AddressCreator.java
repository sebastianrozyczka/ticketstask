import java.util.Scanner;

public class AddressCreator {
    Scanner scanner = new Scanner(System.in);
    public Address create() {
        System.out.println("Gdzie odbywa się wydarzenie, które wybrałeś: ");
        System.out.println("Podaj miasto: ");
        String city = scanner.nextLine();
        System.out.println("Podaj ulicę: ");
        String street = scanner.nextLine();
        return new Address(city, street);
    }
}
