package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class CreateMaintenanceDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 5702638830457411573L;

    private Long garageId;
    private Long carId;
    private String serviceType;
    private String scheduledDate;
}
