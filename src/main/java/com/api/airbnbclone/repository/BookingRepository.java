package com.api.airbnbclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.airbnbclone.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
