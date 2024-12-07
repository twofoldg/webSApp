package com.web.server.app.entity.dto;

import lombok.Data;

@Data
public class UpdateGarageDTO {
    private String name;
    private String location;
    private Integer capacity;
    private String city;
}
