package co.com.sofka.calendar.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
@Document
public class ProgramDate {

    @Id
    private long id;
    private final String categoryName;
    private final LocalDate date;


    public ProgramDate(String categoryName, LocalDate date) {
        this.categoryName = Objects.requireNonNull(categoryName);
        this.date = Objects.requireNonNull(date);
    }
}
