package ad211.vetokhin;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Right Triangle(base = 3, height = 4)");

        RightTriangle MyTriangle = new RightTriangle(3, 4);

        System.out.println("Hypotenuse: " + MyTriangle.Hypotenuse());
        System.out.println("Perimeter: " + MyTriangle.Perimeter());
        System.out.println("Area: " + MyTriangle.Area());

        ///////////////////////////////////////////////////////////

        System.out.println("\n2. Circle(radius = 4)");

        Circle MyCircle = new Circle(4);

        System.out.println("Area: " + MyCircle.Area());
        System.out.println("Circle Length: " + MyCircle.Length());

        ///////////////////////////////////////////////////////////

        Student MyStudent = new Student("Vietokhin Dmytro Semenovych", 2, 211, 93.7, 94, 95, 96, 2000);

        System.out.println("\n3. Student");
        System.out.print("Full name: " + MyStudent.fullName);
        System.out.print("; Year of studying: " + MyStudent.year);
        System.out.print("; Your group: " + MyStudent.group);
        System.out.print("; Your average score: " + MyStudent.average);

        System.out.println("\nAfter ending your studying year you will be at...");
        System.out.println("At  " + MyStudent.NextYear() + " year.");
        System.out.println("If you want to change your average score, it will makes: " + MyStudent.ChangeAverage());
        System.out.println("Your scholarship with average score " + MyStudent.average + " will makes " + MyStudent.scholarship);
        System.out.println("Your scholarship with changed average score (" + MyStudent.ChangeAverage() + ") will makes " + MyStudent.Scholarship());

        ///////////////////////////////////////////////////////////

        Book MyBook = new Book("Harry Potter", "Dmytro Vietokhin", 2003, 99.99, 8);
        System.out.println("\n4. Book");
        System.out.print("Name of the book: " + MyBook.name);
        System.out.print("; Author: " + MyBook.author);
        System.out.print("; Release date: " + MyBook.year);
        System.out.print("; Price of book: " + MyBook.price);
        System.out.print("; Number of books: " + MyBook.number);

        System.out.println("\nAfter the release of another book, the number will be " + MyBook.ChangeNumber());
        System.out.println("Changed price is " + MyBook.ChangePrice());
        System.out.println("Price of all books: " + MyBook.PriceOffAll());
        System.out.println("\nThe end.");
    }
}