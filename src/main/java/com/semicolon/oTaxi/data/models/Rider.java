package com.semicolon.oTaxi.data.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
