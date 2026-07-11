package com.salmahafez.eventbooking.entity;

import com.salmahafez.eventbooking.enums.EventStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String location;

    private LocalDateTime dateTime;

    private int capacity;

    private double ticketPrice;

    @Enumerated(EnumType.STRING)
    private EventStatus status;

    public Event(){

    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public EventStatus getStatus() {
        return status;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }
}
