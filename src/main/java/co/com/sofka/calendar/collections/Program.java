package co.com.sofka.calendar.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "calendar")
public class Program {

    @Id
    private String id;

    private String name;

    private List<CourseTime> courses;

}
