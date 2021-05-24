package cn.edu.xmu.iterator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:35
 * modifiedBy Miyuki 15:35
 **/

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Little Prince"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("The Art of Deal"));
        bookShelf.appendBook(new Book("House of Cards"));

        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }


}
