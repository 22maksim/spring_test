package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        Book myBook = library.getBook();
        System.out.println("Имя книги: " + myBook.getName() + "\nавтор книги: " + myBook.getAuthor()
                                + "\nрейтинг книги равен = " + myBook.getRating());
        myBook.addVolumeRead(90);
        System.out.println(myBook.getVolumeRead() + "%");

        context.close();
    }
}
