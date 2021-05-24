package cn.edu.xmu.iterator;

import java.util.ArrayList;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/17 15:22
 * modifiedBy Miyuki 15:22
 **/

public class BookShelf implements Aggregate{

    private ArrayList<Book> books;

    private int total = 0;

    public BookShelf(int capacity){
        books = new ArrayList<>(capacity);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
        total++;
    }

    public int getLength(){
        return total;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }

}
