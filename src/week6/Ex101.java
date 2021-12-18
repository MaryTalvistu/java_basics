package week6;
import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }
    }

    public static class StringUtils {
        public static boolean included(String word, String searched) {
            searched = searched.trim();

            searched = searched.toUpperCase();
            word = word.toUpperCase();

            if(word.contains(searched))
                return true;
            return false;
        }
    }

    public static class Book {
        private String title;
        private String publisher;
        private int year;

        public Book(String title, String publisher, int year) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
        }

        public String title() {
            return this.title;
        }

        public String publisher() {
            return this.publisher;
        }

        public int year() {
            return this.year;
        }

        public String toString() {
            return this.title + ", " + this.publisher + ", " + this.year;
        }
    }

    public static class Library {
        private ArrayList<Book> books;
        public Library() {
            books = new ArrayList<Book>();
        }

        public void addBook(Book newBook) {
            books.add(newBook);
        }

        public void printBooks() {
            for(Book book : books) {
                System.out.println(book);
            }
        }

        public ArrayList<Book> searchByTitle(String title) {
            ArrayList<Book> foundBooks = new ArrayList<Book>();

            for(Book book : books) {
                if (StringUtils.included(book.title(), title))
                    foundBooks.add(book);
            }
            return foundBooks;
        }

        public ArrayList<Book> searchByPublisher(String publisher) {
            ArrayList<Book> foundBooks = new ArrayList<Book>();

            for(Book book : books) {
                if (StringUtils.included(book.publisher(), publisher))
                    foundBooks.add(book);
            }
            return foundBooks;
        }

        public ArrayList<Book> searchByYear(int year) {
            ArrayList<Book> foundBooks = new ArrayList<Book>();

            for(Book book : books) {
                if (book.year() == year)
                    foundBooks.add(book);
            }
            return foundBooks;
        }
    }
}
