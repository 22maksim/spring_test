package aop;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class UniLibrary extends AbstractLibrary {
    Book book;

    public UniLibrary(Book book) {
        this.book = book;
    }
    @Override
    public Book getBook() {
        return book;
    }




    public String returnBook() throws InterruptedException {
//        System.out.println("получена книга под именем " + book.getName());
        Thread.sleep(100);
        return "Война и мир";
    }





    public void getMagazine() {
        System.out.println("Она была опубликована в журнале 'Wol Street Journal', --get--");
    }
    public void returnMagazine() {
        System.out.println("Она была опубликована в журнале 'Wol Street Journal', --return--");
    }
    public void addBook() {
        System.out.println("Adding book Romanov");
    }
    public void addMagazine() {
        System.out.println("Adding in magazine");
    }
}