package com.web.server.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "cars")
@Data
public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = -5402137050871418165L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    @Column(name = "production_year")
    private Integer productionYear;
    @Column(name = "license_plate")
    private String licensePlate;
}
