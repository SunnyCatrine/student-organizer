package main.java.model.student;

public enum Zone {
    MOSCOW(0, ""),
    MOSCOW_m1(-1, "-1"),
    MOSCOW_m2(-2,"-2"),
    MOSCOW_p1(1, "+1"),
    MOSCOW_p2(2, "+2"),
    MOSCOW_p3(3, "+3"),
    MOSCOW_p4(4, "+4"),
    MOSCOW_p5(5, "+5");

    private Integer zoneInt;
    private String zoneStr;

    Zone(Integer zoneInt, String zoneStr) {
        this.zoneInt = zoneInt;
        this.zoneStr = zoneStr;
    }

    public Integer getZoneInt() {
        return zoneInt;
    }

    public String getZoneStr() {
        return zoneStr;
    }
}
