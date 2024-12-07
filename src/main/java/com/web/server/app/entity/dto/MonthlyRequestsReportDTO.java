package com.web.server.app.entity.dto;

import com.web.server.app.entity.YearMonth;
import lombok.Data;

@Data
public class MonthlyRequestsReportDTO {
    private YearMonth yearMonth;
    private Integer requests;
}
