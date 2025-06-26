DECLARE
    sal NUMBER;
    grade VARCHAR2(10);
BEGIN
    get_employee_salary_grade(102, sal, grade);
    DBMS_OUTPUT.PUT_LINE('Salary: ' || sal);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
END;
/
