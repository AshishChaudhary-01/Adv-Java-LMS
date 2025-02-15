package com.virinchi.LMS.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BookCopy")
public class BookCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long copyID;

    @Column(nullable = false)
    private String copyNumber;

    @Column(nullable = false)
    private String shelfLocation;

    @Column(nullable = false)
    private String status;

    //Constructors
    public BookCopy() {}

    public BookCopy(long copyID, String copyNumber, String shelfLocation, String status) {
        this.copyID = copyID;
        this.copyNumber = copyNumber;
        this.shelfLocation = shelfLocation;
        this.status = status;
    }

    //Getter & Setters
    public long getCopyID() {
        return copyID;
    }

    public void setCopyID(long id) {
        this.copyID = id;
    }

    public String getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    public String getShelfLocation() {
        return shelfLocation;
    }

    public void setShelfLocation(String shelfLocation) {
        this.shelfLocation = shelfLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
