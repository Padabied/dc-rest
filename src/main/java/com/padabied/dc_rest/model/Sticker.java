package com.padabied.dc_rest.model;

import jakarta.validation.constraints.Size;
import lombok.Data;

import jakarta.persistence.*;   //поменял с javax на jakarta

@Data
@Entity
@Table(name = "tbl_sticker")
public class Sticker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 32)
    @Column(nullable = false, unique = true)
    private String name;
}
