package com.semicolon.oTaxi.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Drivers")
@Validated

public class Driver extends AppUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
