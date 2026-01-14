package com.learning.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.movie.entities.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    Theater findByAddress(String address);
}
