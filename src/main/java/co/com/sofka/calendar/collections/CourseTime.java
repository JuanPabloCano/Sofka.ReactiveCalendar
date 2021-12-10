package co.com.sofka.calendar.collections;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseTime {


    private String courseId;
    private String courseName;
    private List<Time> categories;
}
