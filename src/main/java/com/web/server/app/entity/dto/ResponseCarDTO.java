package com.web.server.app.entity.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseCarDTO {
    private Integer id;
    private String make;
    private String model;
    private Integer productionYear;
    private String licensePlate;
    private List<ResponseGarageDTO> garages;
}
