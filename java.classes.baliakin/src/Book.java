import javax.print.DocFlavor;

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

        public Book() {
        }

        public String toString(){
            return id + ", " + title + ", " + author + ", " + publisher + ", " + yearOfPublishing + ", " + numberOfPages + ", " + price + ", " + bindingType;
        }


        public void setId(int bookId) { // Идентификационный номер книги
            if (bookId <= 0) {
                System.out.println("Без корректного ID книги в каталоге мы не сможем её найти - введите действительный ID книги");
            } else {
                id = bookId;
            }
        }
        public int getId() {
        return id;
        }

        public void setTitle(String bookTitle) { // Название книги
            if (bookTitle.isEmpty()) {
                System.out.println("Вы не ввели название книги"); // ПРОВЕРКА на заполняемость поля
            } else {
                title = bookTitle;
            }
        }
        public String getTitle () {
            return title;
        }

        public void setAuthor(String bookAuthor) {  // Автор книги
            if (bookAuthor.isEmpty()) {
                System.out.println("У книг всегда есть автор - введите автора");
            } else {
                author = bookAuthor;
            }
        }
        public String getAuthor () {
            return author;
        }

        public void setPublisher(String bookPublisher) { // Название издательства книги
            if (bookPublisher.isEmpty()) {
                System.out.println("Книги печатают на полиграфии - введите название издательства");
            } else {
                publisher = bookPublisher;
            }
        }
        public String getPublisher () {
            return publisher;
        }

        public void setYearOfPublishing(int bookYearOfPublishing) { // Год издания книги
            if (bookYearOfPublishing <= 0) {
                System.out.println("Это не шутки - год издания не может быть меньше либо равен нулю");
            } else {
                yearOfPublishing = bookYearOfPublishing;
            }
        }
        public int getYearOfPublishing() {
            return yearOfPublishing;
        }

        public void setNumberOfPages(int bookNumberOfPages) { // Количество страниц книги
            if (bookNumberOfPages <=0) {
                System.out.println("Книга не чёрная дыра - в ней должны быть страницы");
            } else {
                numberOfPages = bookNumberOfPages;
            }
        }
        public int getNumberOfPages() {
            return numberOfPages;
            }

        public void setPrice(double bookPrice) { // Стоимость книги
            if (bookPrice <= 0) {
                System.out.println("Мы книги задаром не отдаём - определитесь с ценой");
            } else {
                price = bookPrice;
            }
        }
        public double getPrice() {
            return price;
        }

        public void setBindingType(String bookBindingType) { // Тип переплёта книги
            if (bookBindingType.isEmpty()) {
                System.out.println("Книги уже давно не пишут на бересте - укажите переплёт чтива");
            } else {
                bindingType = bookBindingType;
            }
        }
        public String getBindingType() {
            return bindingType;
        }


}