package gr.hua.dit.ds.tsadimasethelw.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Donator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String living_area;

    private String blood_type;

    private LocalDate lastBloodTest;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="donator_profile_id")
    private DonatorProfile donatorProfileProfile;

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    @OneToMany(mappedBy="donator", cascade = CascadeType.ALL)
    private List<Request> requests;

    public Donator() {
    }

    public Donator(String living_area, String blood_type, LocalDate lastBloodTest) {
        this.living_area = living_area;
        this.blood_type = blood_type;
        this.lastBloodTest = lastBloodTest;
    }



    public Integer getId() {
        return id;
    }

    public String getLiving_area() {
        return living_area;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public LocalDate getLastBloodTest() {
        return lastBloodTest;
    }



    public void setLiving_area(String living_area) {
        this.living_area = living_area;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public void setLastBloodTest(LocalDate lastBloodTest) {
        this.lastBloodTest = lastBloodTest;
    }

    @Override
    public String toString() {
        return "Donator{" +
                "living_area=" + living_area +
                ", blood_type='" + blood_type + '\'' +
                ", lastBloodTest='" + lastBloodTest + '\'' +
                '}';
    }

}
