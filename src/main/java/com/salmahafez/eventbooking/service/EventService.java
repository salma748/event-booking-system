package com.salmahafez.eventbooking.service;

import com.salmahafez.eventbooking.entity.Event;
import com.salmahafez.eventbooking.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public Long createEvent(Event event){
        Event savedEvent = eventRepository.save(event);
        return savedEvent.getId();
    }

    public Event getEventById(Long id){
        return eventRepository.findById(id).get();
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public Event updateEvent(Long id, Event updatedEvent){
        Event existingEvent = eventRepository.findById(id).get();

        existingEvent.setTitle(updatedEvent.getTitle());
        existingEvent.setLocation(updatedEvent.getLocation());
        existingEvent.setDateTime(updatedEvent.getDateTime());
        existingEvent.setCapacity(updatedEvent.getCapacity());
        existingEvent.setTicketPrice(updatedEvent.getTicketPrice());
        existingEvent.setStatus(updatedEvent.getStatus());

        return eventRepository.save(existingEvent);
    }

    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }
}
