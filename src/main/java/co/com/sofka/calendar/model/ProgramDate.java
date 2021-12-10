package co.com.sofka.calendar.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
public class ProgramDate {

    private final String categoryName;
    private final LocalDate date;


    public ProgramDate(String categoryName, LocalDate date) {
        this.categoryName = Objects.requireNonNull(categoryName);
        this.date = Objects.requireNonNull(date);
    }
}
