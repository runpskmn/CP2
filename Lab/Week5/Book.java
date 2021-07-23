
public class Book {

    public String isbn;
    public String title;
    public String type;
    public double price;

    public Book(String isbn, String title, String type, double price) {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }

}

class BookTester {

    void testConstructor() {
        Book b = new Book("9780134464541", "Vulkan Programming Guide", "Programming", 50.78);
        System.out.println(b.isbn);
        System.out.println(b.title);
        System.out.println(b.type);
        System.out.println(b.price);
    }

    public static void main(String[] args) {
        BookTester tester = new BookTester();
        tester.testConstructor();
    }
}
