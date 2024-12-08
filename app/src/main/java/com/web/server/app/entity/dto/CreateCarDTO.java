package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class CreateCarDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 5702638830457411573L;

    private String make;
    private String model;
    private Integer productionYear;
    private String licensePlate;
    private List<Long> garageIds;
}
