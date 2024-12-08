CREATE TABLE IF NOT EXISTS garages (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    "name" VARCHAR(255),
    location VARCHAR(255),
    city VARCHAR(255),
    capacity INT
);