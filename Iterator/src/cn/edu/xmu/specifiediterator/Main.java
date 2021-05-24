package cn.edu.xmu.specifiediterator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:35
 * modifiedBy Miyuki 15:35
 **/

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Little Prince","114"));
        bookShelf.appendBook(new Book("Bible","514"));
        bookShelf.appendBook(new Book("The Art of Deal","1919"));
        bookShelf.appendBook(new Book("House of Cards","810"));

        Iterator iterator = bookShelf.iterator();

        Book book = (Book) iterator.getElementByName("Bible");
        System.out.println(book.getName());
        System.out.println(book.getCode());
    }


}
