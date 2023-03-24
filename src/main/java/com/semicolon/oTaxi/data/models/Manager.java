package com.semicolon.oTaxi.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.validation.annotation.Validated;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Builder
@Entity(name = " Manager")


public class Manager extends AppUser{
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
