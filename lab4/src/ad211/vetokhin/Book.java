package ad211.vetokhin;

public class Book {
    String name;
    String author;
    int year;
    double price;
    int number;

    public Book (String n, String a, int y, double p, int num) {
        name = n;
        author = a;
        year = y;
        price = p;
        number = num;
    }

    public int ChangeNumber() {
        return number + 1;
    }

    public double ChangePrice() {
        return price * number * 0.1;
    }

    public double PriceOffAll() {
        return price * number;
    }


}
