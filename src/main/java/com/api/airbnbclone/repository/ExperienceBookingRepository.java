package com.api.airbnbclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.airbnbclone.model.ExperienceBooking;

@Repository
public interface ExperienceBookingRepository extends JpaRepository<ExperienceBooking, Long> {

}
