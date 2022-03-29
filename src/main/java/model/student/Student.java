package main.java.model.student;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class Student {
    UUID id;
    String name;
    String city;
    MathSubject subject;
    Exam exam;
    Zone timeZone;
    Integer pricePerHour;
    Integer lessonDuration;
    Map<DayOfWeek, LocalDateTime> studentTimetable;
}
