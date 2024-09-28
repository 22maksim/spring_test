package aop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
    @Value("${book.year}")
    private int year;
    @Value("${book.rating}")
    private double rating;
    @Value("${book.numberOfPages}")
    private int numberOfPages;
    @Value("#{0.0}")
    private double volumeRead;

    public void addVolumeRead(int valuesOfPages) {
        volumeRead += (double) valuesOfPages / numberOfPages * 100;
    }

    public String getVolumeRead() {
        return String.format("%.2f", volumeRead);
    }
}
