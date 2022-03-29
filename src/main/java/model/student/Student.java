package main.java.model.student;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private String city;
    private MathSubject subject;
    private Exam exam;
    private Zone timeZone;
    private Integer pricePerHour;
    private Integer lessonDuration;
    private Map<DayOfWeek, LocalDateTime> studentTimetable;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public MathSubject getSubject() {
        return subject;
    }

    public Exam getExam() {
        return exam;
    }

    public Zone getTimeZone() {
        return timeZone;
    }

    public Integer getPricePerHour() {
        return pricePerHour;
    }

    public Integer getLessonDuration() {
        return lessonDuration;
    }

    public Map<DayOfWeek, LocalDateTime> getStudentTimetable() {
        return studentTimetable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id.equals(student.id) &&
                name.equals(student.name) &&
                city.equals(student.city) &&
                subject == student.subject &&
                exam == student.exam &&
                timeZone == student.timeZone &&
                pricePerHour.equals(student.pricePerHour) &&
                lessonDuration.equals(student.lessonDuration) &&
                studentTimetable.equals(student.studentTimetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, subject, exam, timeZone, pricePerHour, lessonDuration, studentTimetable);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject=" + subject +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
