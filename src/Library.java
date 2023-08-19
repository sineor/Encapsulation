import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Library {
    private String name;
    private String addres;
    private Book[] books;

    public Library(String name, String addres, Book[] books) {
        this.name = name;
        this.addres = addres;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    public String addABookToTheLibrary(Book book){
        for (Book b : books) {
            if (b.getName().equals(book.getName())){
                return "Такая книга у нас есть!";
            }
        }
        Book [] books1 = new Book[books.length+1];
        for (int i = 0; i < books.length; i++) {
            books1[i]=books[i];
        }
        books1[books.length]=book;
        books = Arrays.copyOf(books1,books1.length);
        return "Successfully added!";
    }
    public Book[] removeBookFromLibrary(Book bookName){
        Book [] books1 = new Book[books.length-1];
        boolean yes=false;
        for (int i = 0; i <books.length-1 ; i++) {
            if (!books[i].equals(bookName) && !yes) {
                books1[i] = books[i];
            }else {
                books1[i]=books[i+
                        1];
            }
        }
        return books1;
    }
    public Book updateBookByName(String bookName, int newQuantity){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(bookName)){
                books[i].setNumber(newQuantity);
                return books[i];
            }
        }
        return null;
    }
    public Book [] getAllBookByAuthor(String author){
        Book [] books1 = new Book[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)){
                books1= Arrays.copyOf(books1,books1.length+1);
                books1[books1.length-1]=books[i];
            }
        }
        return books1;
    }

    @Override
    public String toString() {
        String address = null;
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", book=" + Arrays.toString(books) +
                '}';
    }
}
