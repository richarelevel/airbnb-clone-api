package com.api.airbnbclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.airbnbclone.model.ExperienceBooking;
import com.api.airbnbclone.repository.ExperienceBookingRepository;

@RestController
public class ExperienceBookingController {
	
	private final ExperienceBookingRepository repository;

	ExperienceBookingController(ExperienceBookingRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/experienceBookings/add")
	ExperienceBooking newBooking(@RequestBody ExperienceBooking newBooking) {
	    return repository.save(newBooking);
	  }

}
