package com.web.server.app.entity.dto;

import lombok.Data;

@Data
public class ResponseGarageDTO {
    private Integer id;
    private String name;
    private String location;
    private String city;
    private Integer capacity;
}
