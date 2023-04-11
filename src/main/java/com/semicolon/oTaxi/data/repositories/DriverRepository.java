package com.semicolon.oTaxi.data.repositories;

import com.semicolon.oTaxi.data.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    List<Driver> findByLocation(String location);
    Optional<Driver> findByemail(String email);
}
