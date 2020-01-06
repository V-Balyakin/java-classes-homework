import java.util.Scanner;

public class UseBooks {
    public static void main(String[] args) {
        Book book1 = new Book(978504, "Последний секрет", "Бернар Вербер", "Эксмо", 2019, 352, 12.69, "Мягкая обложка");
        Book book2 = new Book(978517, "Будущее", "Дмитрий Глуховский", "Аст", 2016, 480, 32.57, "Твёрдый переплёт");
        Book book3 = new Book(9785699, "Не навреди", "Генри Марш", "Эксмо", 2016, 320, 17.63, "Твёрдый переплёт");
        Book book4 = new Book(9785699, "Тук-тук, сердце!", "Йоганн Генрих фон Борстель", "Эксмо", 2016, 256, 20.88, "Твёрдый переплёт");
        Book book5 = new Book(9785170, "В интернете кто-то неправ! Научные исследования спорных вопросов", "Ася Казанцева", "Аст", 2016, 376, 21.29, "Твёрдый переплёт");
        Book book6 = new Book(9785389, "Братья Карамазовы", "Фёдор Достоевский", "Азбука", 2013, 832, 9.44, "Твёрдый переплёт");
        Book book7 = new Book(97856997, "Как работает Google", "Джонатан Розенберг, Эрик Шмидт", "Эксмо", 2019, 416, 13.40, "Мягкая обложка");
        Book book8 = new Book(9785171, "Администратор Инстаграм. Руководство по заработку", "Евгений Козлов, Дмитрий Кудряшов", "Аст", 2019, 322, 17.64, "Твёрдый переплёт");
        Book book9 = new Book(9785386, "Новая энциклопедия Относительного и Абсолютного знания", "Бернар Вербер", "Рипол Классик", 2015, 592, 25.15, "Твёрдый переплёт");
        Book book10 = new Book(9785389, "Незнайка в Солнечном городе", "Николай Носов", "Махаон", 2012, 448, 28.43, "Твёрдый переплёт");
        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        String nameOfAuthorForSearch = getAuthorFromUser();
        findBooksByAuthor(books, nameOfAuthorForSearch);
        String nameOfPublisherForSearch = getPublisherFromUser();
        findBooksByPublisher(books, nameOfPublisherForSearch);
        int yearOfPublishing = getYearOfPublishingFromUser();
        findBooksAfterGivenYear(books, yearOfPublishing);
    }

    private static String getAuthorFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which author book do you want to find? \n*Please write the name of the author with a space");
        return scanner.next() + " " + scanner.next();
    }

    private static String getPublisherFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which publisher book do you want to find? \n* if there are several words in the name of the publisher - write them with a space");
        return scanner.next();
    }

    private static int getYearOfPublishingFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Books after what year do you want to find?");
        return scanner.nextInt();
    }

    private static void findBooksByAuthor(Book[] listOfBooks, String author) {
        int counter = 0;
        System.out.println("Book search result for a given author: ");
        for (Book book : listOfBooks) {
            String currentBookAuthor = book.getAuthor();
            boolean equalsOfAuthors = currentBookAuthor.equalsIgnoreCase(author);
            if (equalsOfAuthors) {
                System.out.println(book);
            } else {
                counter++;
            }
            if (counter >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }

    private static void findBooksByPublisher(Book[] listOfBooks, String publisher) {
        int numberOfBooks = 0;
        System.out.println("Book search results for a given publisher: ");
        for (Book currentBook : listOfBooks) {
            String currentBookPublisher = currentBook.getPublisher();
            boolean toPrint = currentBookPublisher.equalsIgnoreCase(publisher);
            if (toPrint) {
                System.out.println(currentBook);
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }

    private static void findBooksAfterGivenYear(Book[] listOfBooks, int yearOfPublishing) {
        int numberOfBooks = 0;
        System.out.println("Book search result after a given year:");
        for (Book book : listOfBooks) {
            int currentBookYear = book.getYearOfPublishing();
            if (currentBookYear > yearOfPublishing) {
                System.out.println(book.getTitle() + " " + book.getYearOfPublishing());
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("No books found");
            }
        }
    }
}