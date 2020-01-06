public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private String bindingType;

    public Book(int id, String title, String author, String publisher, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String toString() {
        return id + ", " + title + ", " + author + ", " + publisher + ", " + yearOfPublishing + ", " + numberOfPages + ", " + price + ", " + bindingType;
    }


    public void setId(int bookId) {
        if (bookId <= 0) {
            System.out.println("Without the correct book ID in the catalog, we cannot find it - enter a valid book ID");
        } else {
            id = bookId;
        }
    }

    public int getId() {
        return id;
    }

    public void setTitle(String bookTitle) {
        if (bookTitle.isEmpty()) {
            System.out.println("You did not enter a book title");
        } else {
            title = bookTitle;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String bookAuthor) {
        if (bookAuthor.isEmpty()) {
            System.out.println("Books always have an author - enter author");
        } else {
            author = bookAuthor;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String bookPublisher) {
        if (bookPublisher.isEmpty()) {
            System.out.println("Books are printed on printing - enter the name of the publisher");
        } else {
            publisher = bookPublisher;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearOfPublishing(int bookYearOfPublishing) {
        if (bookYearOfPublishing <= 0) {
            System.out.println("These are not jokes - the publication year cannot be less than or equal to zero");
        } else {
            yearOfPublishing = bookYearOfPublishing;
        }
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setNumberOfPages(int bookNumberOfPages) {
        if (bookNumberOfPages <= 0) {
            System.out.println("The book is not a black hole - there should be pages in it");
        } else {
            numberOfPages = bookNumberOfPages;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double bookPrice) {
        if (bookPrice <= 0) {
            System.out.println("We don’t give away books for free - determine the price");
        } else {
            price = bookPrice;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setBindingType(String bookBindingType) {
        if (bookBindingType.isEmpty()) {
            System.out.println("Books have not been written on birch bark for a long time - indicate the binding");
        } else {
            bindingType = bookBindingType;
        }
    }

    public String getBindingType() {
        return bindingType;
    }
}