package com.web.server.app.entity.dto;

import lombok.Data;

@Data
public class CreateGarageDTO {
    private String name;
    private String location;
    private String city;
    private Integer capacity;
}
