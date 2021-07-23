import java.util.ArrayList;

public class BookStore {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(String isbn, String title,
            String type, double price) {
        Book b = new Book(isbn, title, type, price);
        books.add(b);
    }
}

class BookStoreTester {

    void testAddBook(BookStore bs) {
        bs.addBook("9780134464541", 
                "Vulkan Programming Guide",
                "Programming", 50.78);
        bs.addBook("9781491914250", 
                "Deep Learning: A Practitioner's Approach", 
                "Computer Science", 28.56);
        bs.addBook("9780321287137", 
                "Linear Algebra and Its Applications",
                "Mathematics", 9.95);
        System.out.println(bs.books.size());
        Book b = bs.books.get(0);
        System.out.println(b.title);
    }

    public static void main(String[] args) {
        BookStoreTester bst = new BookStoreTester();
        BookStore bs = new BookStore();
        bst.testAddBook(bs);
    }
}
