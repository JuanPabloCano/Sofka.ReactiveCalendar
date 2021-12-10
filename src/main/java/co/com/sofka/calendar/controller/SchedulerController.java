package co.com.sofka.calendar.controller;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/v1")
public class SchedulerController {

    @Autowired
    SchedulerService schedulerService;

    @GetMapping("/generate/{date}/{id}")
    public Flux<ProgramDate> generateCalendar(@PathVariable("date") String date, String id) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        return schedulerService.generateCalendar(id, localDate);
    }
}
