package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class UpdateCarDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1785033817258793241L;

    private String make;
    private String model;
    private Integer productionYear;
    private String licensePlate;
    private List<Long> garageIds;
}
