package main.java.model.student;

public enum LessonDuration {
    HOUR(60),
    HOUR_AND_A_HALF(90),
    TWO_HOURS(120);

    private Integer duration;

    LessonDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDuration() {
        return duration;
    }
}
