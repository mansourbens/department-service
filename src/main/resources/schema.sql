DROP TABLE IF EXISTS DEPARTMENT;

CREATE TABLE DEPARTMENT(
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name NVARCHAR(50),
                           address NVARCHAR(50),
                           code NVARCHAR(3)
);
DROP TABLE IF EXISTS USER;

CREATE TABLE USER(
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     first_name NVARCHAR(50),
                     last_name NVARCHAR(50),
                     email NVARCHAR(50),
                     department_id INT NOT NULL,
                     CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES DEPARTMENT(id)
);