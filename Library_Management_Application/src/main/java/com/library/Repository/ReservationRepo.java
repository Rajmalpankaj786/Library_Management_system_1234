package com.library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.Entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Integer>{

}
