package com.user.data.portal.user.data.portal.models;

import javax.persistence.*;

@Entity
@Table(name="tickets")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="inc_number")
    private String inc_number;
    @Column(name="raised_by")
    private String raised_by;
    @Column(name="priority")
    private String priority;
    @Column(name="assigned_to")
    private String assigned_to;
    @Column(name="cause_of_failure")
    private String cause_of_failure;
    @Column(name="status")
    private String status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getInc_number() {
        return inc_number;
    }

    public void setInc_number(String inc_number) {
        this.inc_number = inc_number;
    }

    public String getRaised_by() {
        return raised_by;
    }

    public void setRaised_by(String raised_by) {
        this.raised_by = raised_by;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getCause_of_failure() {
        return cause_of_failure;
    }

    public void setCause_of_failure(String cause_of_failure) {
        this.cause_of_failure = cause_of_failure;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
