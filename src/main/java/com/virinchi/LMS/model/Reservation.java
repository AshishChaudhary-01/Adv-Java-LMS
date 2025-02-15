package com.virinchi.LMS.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationID;

    @Column(nullable = false)
    private LocalDate reservationDate;

    @Column(nullable = false)
    private LocalDate pickupDate;

    @Column(nullable = false)
    private String reservationStatus;

    //Constructors
    public Reservation() {}

    public Reservation(long ReservationID, LocalDate reservationDate, LocalDate pickupDate, String reservationStatus) {
        this.reservationID = ReservationID;
        this.reservationDate = reservationDate;
        this.pickupDate = pickupDate;
        this.reservationStatus = reservationStatus;
    }

    //Getter & Setters
    public long getReservationID() {
        return reservationID;
    }

    public void setReservationID(long id) {
        this.reservationID = id;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
