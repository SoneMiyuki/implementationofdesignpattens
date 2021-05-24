package cn.edu.xmu.specifiediterator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:32
 * modifiedBy Miyuki 15:32
 **/

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext(){
        return (index < bookShelf.getLength());
    }

    public Object next(){
        Book book = bookShelf.getBookAt(index++);
        return book;
    }

    public Object getElementByName(String name){
        Iterator iterator = new BookShelfIterator(bookShelf);

        do{
            Book book = (Book)iterator.next();
            if(book.getName() == name){
                return book;
            }

        } while(iterator.hasNext());
        return null;
    }
}
