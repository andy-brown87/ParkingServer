package ParkingServer316.models;


import jakarta.persistence.*;

@Entity
@Table(name="Hours")

public class Hours {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "mon_start")
    private String MonStart;

    @Column(name = "mon_end")
    private String MonEnd;

    @Column(name = "tues_start")
    private String TuesStart;

    @Column(name = "tues_end")
    private String TuesEnd;

    @Column(name = "wed_start")
    private String WedStart;

    @Column(name = "wed_end")
    private String WedEnd;

    @Column(name = "thurs_start")
    private String ThursStart;

    @Column(name = "thurs_end")
    private String ThursEnd;

    @Column(name = "fri_start")
    private String FriStart;

    @Column(name = "fri_end")
    private String FriEnd;

    @Column(name = "sat_start")
    private String SatStart;

    @Column(name = "sat_end")
    private String SatEnd;

    @Column(name = "sun_start")
    private String SunStart;

    @Column(name = "sun_end")
    private String SunEnd;

    public Hours(long id, String monStart, String monEnd, String tuesStart, String tuesEnd, String wedStart, String wedEnd, String thursStart, String thursEnd, String friStart, String friEnd, String satStart, String satEnd, String sunStart, String sunEnd) {
        this.id = id;
        MonStart = monStart;
        MonEnd = monEnd;
        TuesStart = tuesStart;
        TuesEnd = tuesEnd;
        WedStart = wedStart;
        WedEnd = wedEnd;
        ThursStart = thursStart;
        ThursEnd = thursEnd;
        FriStart = friStart;
        FriEnd = friEnd;
        SatStart = satStart;
        SatEnd = satEnd;
        SunStart = sunStart;
        SunEnd = sunEnd;
    }

    public Hours() {
    }

    public long getId() {
        return id;
    }



//    public void setId(long id) {
//        this.id = id;
//    }

    public String getMonStart() {
        return MonStart;
    }

//    public void setMonStart(String monStart) {
//        MonStart = monStart;
//    }

    public String getMonEnd() {
        return MonEnd;
    }

//    public void setMonEnd(String monEnd) {
//        MonEnd = monEnd;
//    }

    public String getTuesStart() {
        return TuesStart;
    }

//    public void setTuesStart(String tuesStart) {
//        TuesStart = tuesStart;
//    }

    public String getTuesEnd() {
        return TuesEnd;
    }

//    public void setTuesEnd(String tuesEnd) {
//        TuesEnd = tuesEnd;
//    }

    public String getWedStart() {
        return WedStart;
    }

//    public void setWedStart(String wedStart) {
//        WedStart = wedStart;
//    }

    public String getWedEnd() {
        return WedEnd;
    }

//    public void setWedEnd(String wedEnd) {
//        WedEnd = wedEnd;
//    }

    public String getThursStart() {
        return ThursStart;
    }

//    public void setThursStart(String thursStart) {
//        ThursStart = thursStart;
//    }

    public String getThursEnd() {
        return ThursEnd;
    }

//    public void setThursEnd(String thursEnd) {
//        ThursEnd = thursEnd;
//    }

    public String getFriStart() {
        return FriStart;
    }

//    public void setFriStart(String friStart) {
//        FriStart = friStart;
//    }

    public String getFriEnd() {
        return FriEnd;
    }

//    public void setFriEnd(String friEnd) {
//        FriEnd = friEnd;
//    }

    public String getSatStart() {
        return SatStart;
    }

//    public void setSatStart(String satStart) {
//        SatStart = satStart;
//    }

    public String getSatEnd() {
        return SatEnd;
    }

//    public void setSatEnd(String satEnd) {
//        SatEnd = satEnd;
//    }

    public String getSunStart() {
        return SunStart;
    }

//    public void setSunStart(String sunStart) {
//        SunStart = sunStart;
//    }

    public String getSunEnd() {
        return SunEnd;
    }

//    public void setSunEnd(String sunEnd) {
//        SunEnd = sunEnd;
//    }
}
