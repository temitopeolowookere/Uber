package com.semicolon.oTaxi.data.repositories;

import com.semicolon.oTaxi.data.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {

    boolean existsByEmail(String email);
    Optional<Driver> findByEmail(String email);
}

