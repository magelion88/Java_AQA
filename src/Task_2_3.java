public class Task_2_3 {
    public static void main(String[] args) {
        product item = new product("Клюква", "Норвегия", 10, "забронировано");
        item.printInfo();
    }
}

class product {
    private String name;
    private String countryOfOrigin;
    private int price;
    private String bookingStatus;

    public product(String name, String countryOfOrigin, int price, String bookingStatus) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    public void printInfo() {
        System.out.println("Товар " + name + " произведённый в стране " + countryOfOrigin + " с ценой " + price + " у.е. в статусе " + bookingStatus);
    }
}