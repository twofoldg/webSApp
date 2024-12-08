package com.web.server.app.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "maintenances")
@Data
public class Maintenance implements Serializable {
    @Serial
    private static final long serialVersionUID = -9220164533184002506L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "garage_id")
    private Long garageId;
    @Column(name = "car_id")
    private Long cardId;
    @Column(name = "service_type")
    private String serviceType;
    @Column(name = "scheduled_date")
    private String scheduledDate;

}
