package com.salmahafez.eventbooking.controller;

import com.salmahafez.eventbooking.entity.Event;
import com.salmahafez.eventbooking.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService){
        this.eventService=eventService;
    }

    @PostMapping
    public Long createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id){
        return eventService.getEventById(id);
    }

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id , @RequestBody Event updatedEvent){
        return eventService.updateEvent(id , updatedEvent);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id){
        eventService.deleteEvent(id);
    }
}
