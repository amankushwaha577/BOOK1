import java.io.*;
import java.util.*;
class Book{
    private String c;
    private String a;
    private String i;
    public void setBookName(String c){
        this.c=c;
    }
    public void setAuthorName(String a){
        this.a=a;
    }
    public void setISBN(String i){
        this.i=i;
    }
    public String getBookName(){
        return c;
    }
    public String getAuthorName(){
        return a;
    }
    public String getISBN(){
        return i;
    }

    Book(String bookName,String authorName,String isbnNumber){
        c=bookName;
        a=authorName;
        i=isbnNumber;
    }
    @Override
    public String toString(){
        return "-----------------------------\n"+
                "Book Name:      "+getBookName()+"\nAuthor Name:    "+getAuthorName()+
                "\nISBN:   "+getISBN()+"\n-----------------------------";
    }
}

