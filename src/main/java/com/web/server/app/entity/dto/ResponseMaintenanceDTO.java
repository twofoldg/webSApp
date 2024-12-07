package com.web.server.app.entity.dto;

import lombok.Data;

@Data
public class ResponseMaintenanceDTO {
    private Integer id;
    private Integer cardId;
    private String carName;
    private String serviceType;
    private String scheduledDate;
    private Integer garageId;
    private String garageName;
}
