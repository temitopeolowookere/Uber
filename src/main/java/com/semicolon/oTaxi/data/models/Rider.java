package com.semicolon.oTaxi.data.models;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Riders")

public class Rider extends AppUser{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
