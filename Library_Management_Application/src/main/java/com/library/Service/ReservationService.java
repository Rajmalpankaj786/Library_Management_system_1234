package com.library.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Repository.ReservationRepo;


@Service
public class ReservationService {

	@Autowired
	private ReservationRepo reservationRepo;
	
	
	
	
}
