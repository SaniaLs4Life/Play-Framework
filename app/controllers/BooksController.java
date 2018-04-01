package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.books.*;
import views.html.index;

import java.util.Set;
import java.util.concurrent.RecursiveTask;

import  javax.inject.Inject;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;
    //for all books

    public Result index(){
        Set<Book> books =Book.allBooks();
        return ok(views.html.books.index.render(books));
    }

    //to create book

    public  Result create(){
        Form<Book>bookForm= formFactory.form(Book.class);
        return ok(create.render(bookForm));
    }

    //to save book

    public Result save(){

        Form<Book>bookForm= formFactory.form(Book.class).bindFromRequest();
        Book book = bookForm.get();
        Book.add(book);
        return redirect(routes.BooksController.index());
    }

    public Result edit(Integer id){

        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result destroy(Integer id){
        return TODO;
    }
        //for details
    public  Result show(Integer id){

        return TODO;
    }
}
