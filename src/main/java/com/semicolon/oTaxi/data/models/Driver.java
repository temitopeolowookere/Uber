package com.semicolon.oTaxi.data.models;

import com.semicolon.oTaxi.data.models.enums.Driverstatus;
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
    private boolean isEnabled;
    @Enumerated(value = EnumType.STRING)
    private Driverstatus driverstatus;
    private String location;
}
