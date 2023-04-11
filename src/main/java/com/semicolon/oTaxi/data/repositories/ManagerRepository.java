package com.semicolon.oTaxi.data.repositories;

import com.semicolon.oTaxi.data.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ManagerRepository extends JpaRepository<Manager,Long> {
    Optional<Manager>findByEmail(String email);
}
