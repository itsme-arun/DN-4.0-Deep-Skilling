CREATE TABLE employee (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER
);

INSERT INTO employee VALUES (101, 'Arun', 8000);
INSERT INTO employee VALUES (102, 'Ravi', 30000);
INSERT INTO employee VALUES (103, 'Kumar', 60000);
COMMIT;
