import java.util.ArrayList;
import java.util.Scanner;

public class Magaz {
    public static void main(String[] args) {
        String[] firms = {"Casio", "Apple", "Rolex"};
        String[][] items = {{"MTS-100", "Casio"}, {"Apple watch", "Apple"}, {"Submariner", "Rolex"}};

        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ваше ФИО: ");
            String name = scanner.nextLine();
            System.out.print("Введите ваш  email: ");
            String email = scanner.nextLine();
            System.out.print("Введите ваш телефон: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Доступные часы:");
            for (int j = 0; j < items.length; j++) {
                System.out.println(j + ". " + items[j][0] + " - " + items[j][1]);
            }

            System.out.print("Введите индекс часов которые вы хотите приобрести: ");
            int itemIndex = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите количество: ");
            int quantity = scanner.nextInt();

            customers.add(new Customer(name, email, phoneNumber, items[itemIndex][0], items[itemIndex][1], quantity));
        }

        for (Customer customer : customers) {
            System.out.println("Покупатель: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Телефон: " + customer.getPhoneNumber());
            System.out.println("Часы: " + customer.getItem() + customer.getFirm());
            System.out.println("Количество: " + customer.getQuantity());
            System.out.println();
        }
    }

    static class Customer {
        private String name;
        private String email;
        private String phoneNumber;
        private String item;
        private String firm;
        private int quantity;

        public Customer(String name, String email, String phoneNumber, String item, String firm, int quantity) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.item = item;
            this.firm = firm;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getItem() {
            return item;
        }

        public String getFirm() {
            return firm;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}