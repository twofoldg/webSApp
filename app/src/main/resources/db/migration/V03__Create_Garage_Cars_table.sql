CREATE TABLE IF NOT EXISTS garage_cars (
    garage_id BIGSERIAL NOT NULL,
    car_id BIGSERIAL NOT NULL,
    CONSTRAINT garage_cars_fk_garage FOREIGN KEY (garage_id) REFERENCES garages(id),
    CONSTRAINT garage_cars_fk_car FOREIGN KEY (car_id) REFERENCES cars(id));