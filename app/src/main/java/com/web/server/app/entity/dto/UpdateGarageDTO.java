package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UpdateGarageDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -6579270826272126287L;

    private String name;
    private String location;
    private Integer capacity;
    private String city;
}
