public class Book {
    private final int id;
    private String title;
    private String author;
    private double price;
    private static int totalBooks;

    { // init block
        totalBooks++;
    }

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // overloaded constructor + this()
    public Book(int id, String title) {
        this(id, title, "Unknown", 0.0);
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public String toString() {
        return "Book{id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price + '}';
    }
}