CREATE TABLE IF NOT EXISTS cars (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    make VARCHAR(255),
    model VARCHAR(255),
    production_year int,
    license_plate INT UNIQUE NOT NULL
);