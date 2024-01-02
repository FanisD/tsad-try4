package gr.hua.dit.ds.tsadimasethelw.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer Id;

    private LocalDate appointmentDate;

    public Request() {
    }

    public Request(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Donator getDonator() {
        return donator;
    }

    public void setDonator(Donator donator) {
        this.donator = donator;
    }

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="donator_id")
    private Donator donator;

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "Id=" + Id +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
