package models;

import java.util.HashSet;
import java.util.Set;

//import com.avaje.ebean.Model;
//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Book /*extends Model*/ {

    //@Id
    public  Integer id;
    public String title;
    public String author;
    public Integer price;
    //public static final Finder<Long, Task> find = new Finder<>(Task.class);

    public Book(){};
    public  Book(Integer id,Integer price,String title,String author){

        this.id=id;
        this.price=price;
        this.title=title;
        this.author=author;
    }

    private static Set<Book>books;

    static {
        books=new HashSet<>();
        books.add(new Book( 1,10,  "C++",  "Burak"));
        books.add(new Book( 2,  20,"Java",  "Hakan"));
    }

    public static  Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for (Book book : books){
            if(id.equals(book.id)){

                return book;

            }
        }
        return null;
    }

    public  static  void  add(Book book){

        books.add(book);
    }

    public static  boolean remove(Book book){

        return books.remove(book);
    }
}
