package chapter_five;

public class BookStore
{
    private static int bookSold = 0;
    private String storeID;
    private String bookCategory;
    private String author;
    private String title;
    private String publisher;
    private double price;
    private int quantity;


    public BookStore(String storeID, String bookCategory,
                     String author, String title,
                     String publisher, double price,
                     int quantity)
    {
        this.storeID = storeID;
        setBookCategory(bookCategory);
        setAuthor(author);
        setPublisher(publisher);
        setTitle(title);
        setPrice(price);
        setQuantity(quantity);
    }


    public void trackSalesStatus()
    {
        System.out.println("Book Sold: " + bookSold);
    }

    public boolean sell()
    {
        if (getQuantity()-1 > 0){
            bookSold++; setQuantity(getQuantity()-1);
            return true;
        }
        return false;
    }

    public String getBookCategory()
    {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory)
    {
        if (bookCategory.equals("Kids")
                || bookCategory.equals("Engineering")
                || bookCategory.equals("Story"))
            this.bookCategory = bookCategory;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        if (!author.isEmpty())
            this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        if (!title.isEmpty())
            this.title = title;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public void setPublisher(String publisher)
    {
        if (!publisher.isEmpty())
            this.publisher = publisher;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price >= 0)
            this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        if (quantity >= 0)
            this.quantity = quantity;
    }
}
