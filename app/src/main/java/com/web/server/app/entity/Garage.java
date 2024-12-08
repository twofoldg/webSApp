package com.web.server.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "garages")
@Data
public class Garage implements Serializable {
    @Serial
    private static final long serialVersionUID = 6963014019871962647L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String city;
    private Integer capacity;
    @ManyToMany
    @JoinTable(
            name = "garage_cars",
            joinColumns = @JoinColumn(name = "garage_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List<Car> cars;
}
