package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class CreateGarageDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4207931252777459647L;

    private String name;
    private String location;
    private String city;
    private Integer capacity;
}
