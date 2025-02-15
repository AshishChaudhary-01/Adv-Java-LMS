package com.virinchi.LMS.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "issuedBook")
public class IssuedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long issueID;

    @Column(nullable = false)
    private LocalDate issueDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @Column(nullable = false)
    private LocalDate returnDate;


    @Column(nullable = false)
    private String issuedBy;

    @Column(nullable = false)
    private String issueStatus;

    //Constructors
    public IssuedBook() {}

    public IssuedBook(Long issueID, LocalDate issueDate, LocalDate dueDate, LocalDate returnDate, String issuedBy, String issueStatus) {
        this.issueID = issueID;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.issuedBy = issuedBy;
        this.issueStatus = issueStatus;
    }

    //Getters & Setters
    public Long getIssueID() {
        return issueID;
    }

    public void setIssueID(Long issueID) {
        this.issueID = issueID;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }
}

