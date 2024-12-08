package com.web.server.app.entity.dto;

import com.web.server.app.entity.YearMonth;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class MonthlyRequestsReportDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -6497715133507800525L;

    private YearMonth yearMonth;
    private Integer requests;
}
