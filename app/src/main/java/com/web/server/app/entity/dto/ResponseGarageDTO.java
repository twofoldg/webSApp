package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ResponseGarageDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 2048454486945695078L;

    private Long id;
    private String name;
    private String location;
    private String city;
    private Integer capacity;
}
