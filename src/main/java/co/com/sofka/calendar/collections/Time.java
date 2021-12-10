package co.com.sofka.calendar.collections;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Time {

    private String categoryId;
    private Integer days;
    private String categoryName;
    private List<String> urlsRefGradles;
}
