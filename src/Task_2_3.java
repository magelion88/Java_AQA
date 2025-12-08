public class Task_2_3 {
    public static void main(String[] args) {
        SimpleProduct item = new SimpleProduct("Клюква", "Норвегия", 10, true);
        item.printInfo();



        TechProduct[] products = new TechProduct[5];

        products[0] = new TechProduct("Tuvio WFF76HW21", "01.03.2024",
                "Yandex", "Россия", 21000.0, true);
        products[1] = new TechProduct("Weissgauff WM 4927", "15.02.2024",
                "Weissgauff", "Германия", 21000.0, true);
        products[2] = new TechProduct("Beko WSPE7612W", "10.01.2024",
                "Beko", "Турция", 20000.0, true);
        products[3] = new TechProduct("DeLonghi MARSELLA", "20.02.2024",
                "DeLonghi", "Италия", 20000.0, false);
        products[4] = new TechProduct("ARG JG80-A212VE", "05.03.2024",
                "ARG", "Китай", 21000.0, true);

        for(int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].name +
                    " - " + products[i].price + " руб.");
        }
    }
}

class SimpleProduct {
    private String name;
    private String countryOfOrigin;
    private int price;
    private boolean bookingStatus;

    public SimpleProduct(String name, String countryOfOrigin, int price, boolean bookingStatus) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    public void printInfo() {
        System.out.println("Товар " + name + " произведённый в стране " +
                countryOfOrigin + " с ценой " + price +
                " у.е. в статусе " + bookingStatus);
    }
}

class TechProduct {
    String name;
    String productionData;
    String manufacturer;
    String country;
    double price;
    boolean inStock;

    public TechProduct(String name, String productionDate, String manufacturer,
                       String country, double price, boolean inStock) {
        this.name = name;
        this.productionData = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.inStock = inStock;
    }
}