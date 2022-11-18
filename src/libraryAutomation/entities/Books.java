package libraryAutomation.entities;

public class Books {
    private int id;
    private String bookName;
    private String authorName;
    private int bookStock;
    private double unitPrice;

    public Books() {

    }

    public Books(int id, String bookName, String authorName, int bookStock, double unitPrice) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookStock = bookStock;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int numberOfBooks) {
        this.bookStock = numberOfBooks;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
