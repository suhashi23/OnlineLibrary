class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }
    void issueBook(String book){
        for(int i = 0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued!" );
                this.books[i] = null;
                return;
            }
            System.out.println("This book does not exist");
        }
    }
    void returnBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been returned!");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
}
public class Onlinelibrary {
    public static void main(String[] args){
        Library centralLibrary = new Library();
        centralLibrary.addBook("Gullivers Travel");
        centralLibrary.addBook("2 States");
        centralLibrary.addBook("Invisible Man");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Gullivers Travel");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Gullivers Travel");
        centralLibrary.showAvailableBooks();
    }
}
