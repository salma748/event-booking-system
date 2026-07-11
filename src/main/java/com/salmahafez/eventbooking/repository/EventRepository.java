package com.salmahafez.eventbooking.repository;

import com.salmahafez.eventbooking.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {

}
