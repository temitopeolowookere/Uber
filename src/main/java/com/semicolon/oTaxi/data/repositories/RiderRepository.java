package com.semicolon.oTaxi.data.repositories;

import com.semicolon.oTaxi.data.models.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {


    boolean existsByEmail(String email);

    Rider findByEmail(String email);
}
