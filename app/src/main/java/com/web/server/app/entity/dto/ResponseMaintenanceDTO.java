package com.web.server.app.entity.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ResponseMaintenanceDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 6649845342094257785L;

    private Long id;
    private Long cardId;
    private String carName;
    private String serviceType;
    private String scheduledDate;
    private Long garageId;
    private String garageName;
}
