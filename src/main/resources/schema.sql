DROP TABLE IF EXISTS DEPARTMENT;

CREATE TABLE DEPARTMENT(
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name NVARCHAR(50),
                           address NVARCHAR(50),
                           code NVARCHAR(3)
);