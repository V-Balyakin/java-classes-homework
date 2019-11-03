import java.util.Scanner;

public class UseBooks {
    public static void main(String[] args) {
        Book book1 = new Book(978504, "Последний секрет", "Бернар Вербер", "Эксмо", 2019, 352, 12.69, "Мягкая обложка");
        Book book2 = new Book(978517, "Будущее", "Дмитрий Глуховский", "Аст", 2016, 480, 32.57, "Твёрдый переплёт");
        Book book3 = new Book(9785699, "Не навреди", "Генри Марш", "Эксмо", 2016, 320, 17.63, "Твёрдый переплёт");
        Book book4 = new Book();
        // задаём параметры для 4 книги с помощью геттеров и сеттеров
        book4.setId(9785699);
        book4.setTitle("Тук-тук, сердце! Как подружиться с самым неутомимым органом, и что будет, если этого не сделать");
        book4.setAuthor("Йоганн Генрих фон Борстель");
        book4.setPublisher("Эксмо");
        book4.setYearOfPublishing(2016);
        book4.setNumberOfPages(256);
        book4.setPrice(20.88);
        book4.setBindingType("Твёрдый переплёт");
        // окончание параметров 4 книги
        Book book5 = new Book(9785170, "В интернете кто-то неправ! Научные исследования спорных вопросов", "Ася Казанцева", "Аст", 2016, 376, 21.29, "Твёрдый переплёт");
        Book book6 = new Book(9785389, "Братья Карамазовы", "Фёдор Достоевский", "Азбука", 2013, 832, 9.44, "Твёрдый переплёт");
        Book book7 = new Book(97856997, "Как работает Google", "Джонатан Розенберг, Эрик Шмидт", "Эксмо", 2019, 416, 13.40, "Мягкая обложка");
        Book book8 = new Book(9785171, "Администратор Инстаграм. Руководство по заработку", "Евгений Козлов, Дмитрий Кудряшов", "Аст", 2019, 322, 17.64, "Твёрдый переплёт");
        Book book9 = new Book(9785386, "Новая энциклопедия Относительного и Абсолютного знания", "Бернар Вербер", "Рипол Классик", 2015, 592, 25.15, "Твёрдый переплёт");
        Book book10 = new Book(9785389, "Незнайка в Солнечном городе", "Николай Носов", "Махаон", 2012, 448, 28.43, "Твёрдый переплёт");

        Book[] books = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10}; // создаём массив из книг
        /*
        System.out.println("Все книги в вашем каталоге:"); // вывод на печать всех книг каталога
        for (int i=0; i < books.length; i++) {
            System.out.print(i+1 + ". ");
            System.out.println(books[i]);
        }
         */
        System.out.println("");
        book1.setTitle("Первый секрет"); // пример изменения названия книги

        Scanner nameOfAuthorFromUser = new Scanner(System.in);
        System.out.println("Книгу какого автора желаете найти?"); // Пользователь вводит имя автора для поиска
        System.out.println("*напишите имя и фамилию автора с большой буквы через пробел");
        String nameOfAuthorForSearch = nameOfAuthorFromUser.next() + " " + nameOfAuthorFromUser.next();

        findBooksByAuthor(books, nameOfAuthorForSearch); // вызываем метод для поиска книг нужного автора
        System.out.println("");

        Scanner nameOfPublisherFromUser = new Scanner(System.in);
        System.out.println("Книгу какого издательства вы желаете найти?"); // Пользователь вводит название издательства для поиска
        System.out.println("*если в названии издательства одно слово - напишите его с большой буквы");
        System.out.println("**если в названии издательства несколько слов - напишите их также с большой буквы и через пробел");
        String nameOfPublisherForSearch = nameOfPublisherFromUser.next();

        findBooksByPublisher(books, nameOfPublisherForSearch); // вызываем метод для поиска книг нужного издательства
        System.out.println("");

        Scanner nameOfYearFromUser = new Scanner(System.in);
        System.out.println("Книги после какого года желаете найти?"); // Пользователь вводит год
        int nameOfYearForSearch = nameOfYearFromUser.nextInt();

        findBooksAfterGivenYear(books, nameOfYearForSearch); // вызываем метод для поиска книг после заданного года
        System.out.println("");
    }

    private static void findBooksByAuthor(Book[] listOfBooks, String author) {
        int numberOfBooks = 0;
        System.out.println("Результат поиска книг по заданному автору:");
        for (int i = 0; i < listOfBooks.length; i++) {
            Book currentAuthor = listOfBooks[i];
            String currentBookAuthor = currentAuthor.getAuthor();
            boolean bookByAuthorToPrint = currentBookAuthor.equals(author);
            if (bookByAuthorToPrint) {
                System.out.println(listOfBooks[i]);
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("Книг не найдено");
            }
        }
    }

    private static void findBooksByPublisher(Book[] listOfBooks, String publisher) {
        int numberOfBooks = 0;
        System.out.println("Результат поиска книг по заданному издательству:");
        for (int i = 0; i < listOfBooks.length; i++) {
            Book currentBook = listOfBooks[i];
            String currentBookPublisher = currentBook.getPublisher();
            boolean toPrint = currentBookPublisher.equals(publisher);
            if (toPrint) {
                System.out.println(listOfBooks[i]);
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("Книг не найдено");
            }
        }
    }

    private static void findBooksAfterGivenYear(Book[] listOfBooks, int yearOfPublishing) {
        int numberOfBooks = 0;
        System.out.println("Результат поиска книг после заданного года:");
        for (int i = 0; i < listOfBooks.length; i++) {
            Book currentYear = listOfBooks[i];
            int currentBookYear = currentYear.getYearOfPublishing();
            if (currentBookYear > yearOfPublishing) {
                System.out.println(listOfBooks[i]);
            } else {
                numberOfBooks++;
            }
            if (numberOfBooks >= listOfBooks.length) {
                System.out.println("Книг не найдено");
            }
        }
    }
}


 /*if(listOfBooks[i].getPublisher().equals(publisher)) { // альтернативный вариант работы метода
         System.out.println(listOfBooks[i]);
         }
  */