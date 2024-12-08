package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
public class ResponseCarDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -889731648787475658L;

    private Long id;
    private String make;
    private String model;
    private Integer productionYear;
    private String licensePlate;
    private List<ResponseGarageDTO> garages;
}
