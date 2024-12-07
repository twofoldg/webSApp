package com.web.server.app.entity.dto;

import lombok.Data;

@Data
public class CreateMaintenanceDTO {
    private Integer garageId;
    private Integer carId;
    private String serviceType;
    private String scheduledDate;
}
