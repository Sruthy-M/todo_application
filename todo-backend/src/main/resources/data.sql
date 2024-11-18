CREATE TABLE IF NOT EXISTS todo (
    id INT PRIMARY KEY,
    username VARCHAR(255),
    description VARCHAR(255),
    target_date TIMESTAMP,
    is_done BOOLEAN
);

INSERT INTO todo(id, username, description, target_date, is_done)
VALUES(10001, 'admin', 'Learn JPA', CURRENT_TIMESTAMP, false);

INSERT INTO todo(id, username, description, target_date, is_done)
VALUES(10002, 'admin', 'Learn React', CURRENT_TIMESTAMP, true);

INSERT INTO todo(id, username, description, target_date, is_done)
VALUES(10003, 'admin', 'Learn Microservices', CURRENT_TIMESTAMP, false);