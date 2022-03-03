package com.api.airbnbclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.airbnbclone.model.Booking;
import com.api.airbnbclone.repository.BookingRepository;

@RestController
public class BookingController {
	
	private final BookingRepository repository;

	BookingController(BookingRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/bookings/add")
	Booking newBooking(@RequestBody Booking newBooking) {
	    return repository.save(newBooking);
	  }

}
