package com.learning.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.movie.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
