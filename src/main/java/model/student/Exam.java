package main.java.model.student;

public enum Exam {
    NO(""),
    EGE_B("EGE Base level"),
    EGE_P("EGE Profile level"),
    OGE("OGE"),
    VPR("VPR"),
    SESSION("Session exams"),
    ENTRANCE("Entrance exams");

    private String examName;

    Exam(String examName) {
        this.examName = examName;
    }

    public String getExamName() {
        return examName;
    }
}
