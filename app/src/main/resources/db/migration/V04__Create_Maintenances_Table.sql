CREATE TABLE IF NOT EXISTS maintenances (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    garage_id BIGSERIAL NOT NULL,
    car_id BIGSERIAL NOT NULL,
    service_type VARCHAR(255),
    scheduled_date DATE
);