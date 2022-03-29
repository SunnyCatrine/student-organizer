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

    public Student(String name, String city, MathSubject subject, Exam exam, Zone timeZone, Integer pricePerHour, Integer lessonDuration, Map<DayOfWeek, LocalDateTime> studentTimetable) {
        this.name = name;
        this.city = city;
        this.subject = subject;
        this.exam = exam;
        this.timeZone = timeZone;
        this.pricePerHour = pricePerHour;
        this.lessonDuration = lessonDuration;
        this.studentTimetable = studentTimetable;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public final static class StudentBuilder {
        private String name;
        private String city;
        private MathSubject subject;
        private Exam exam;
        private Zone timeZone;
        private Integer pricePerHour;
        private Integer lessonDuration;
        private Map<DayOfWeek, LocalDateTime> studentTimetable;

        public final StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public final StudentBuilder city(String city) {
            this.city = city;
            return this;
        }

        public final StudentBuilder subject(MathSubject subject) {
            this.subject = subject;
            return this;
        }

        public final StudentBuilder exam(Exam exam) {
            this.exam = exam;
            return this;
        }

        public final StudentBuilder timeZone(Zone timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public final StudentBuilder pricePerHour(Integer pricePerHour) {
            this.pricePerHour = pricePerHour;
            return this;
        }

        public final StudentBuilder lessonDuration(Integer lessonDuration) {
            this.lessonDuration = lessonDuration;
            return this;
        }

        public final StudentBuilder studentTimeTable(Map<DayOfWeek, LocalDateTime> studentTimetable) {
            this.studentTimetable = studentTimetable;
            return this;
        }

        public final Student build() {
            return new Student(name, city, subject, exam, timeZone, pricePerHour, lessonDuration, studentTimetable);
        }
    }

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
