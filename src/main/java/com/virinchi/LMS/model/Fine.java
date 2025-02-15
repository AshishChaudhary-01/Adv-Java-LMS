package com.virinchi.LMS.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "fine")
public class Fine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fineID;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private String FineStatus;

    @Column(nullable = false)
    private LocalDate paymentDate;

    //Constructors
    public Fine() {}

    public Fine(long fineID, double amount, String fineStatus, LocalDate paymentDate) {
        this.fineID = fineID;
        this.amount = amount;
        FineStatus = fineStatus;
        this.paymentDate = paymentDate;
    }

    //Getters & Setters
    public long getFineID() {
        return fineID;
    }

    public void setFineID(long fineID) {
        this.fineID = fineID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFineStatus() {
        return FineStatus;
    }

    public void setFineStatus(String fineStatus) {
        FineStatus = fineStatus;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
