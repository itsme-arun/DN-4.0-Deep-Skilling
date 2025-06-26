SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE get_employee_salary_grade (
    p_emp_id IN NUMBER,
    p_salary OUT NUMBER,
    p_grade OUT VARCHAR2
) AS
BEGIN
    SELECT salary INTO p_salary FROM employee WHERE emp_id = p_emp_id;

    IF p_salary < 10000 THEN
        p_grade := 'Low';
    ELSIF p_salary BETWEEN 10000 AND 50000 THEN
        p_grade := 'Medium';
    ELSE
        p_grade := 'High';
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee ID not found.');
        p_salary := NULL;
        p_grade := NULL;
END;
/
