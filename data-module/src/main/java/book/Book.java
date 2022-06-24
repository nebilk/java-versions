package book;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pageNumber;

    public Book(int id, String name, String author, int pageNumber) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
