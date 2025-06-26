SET SERVEROUTPUT ON;

DECLARE
    num NUMBER := &Enter_Number;
BEGIN
    IF num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('The number is Positive');
    ELSIF num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('The number is Negative');
    ELSE
        DBMS_OUTPUT.PUT_LINE('The number is Zero');
    END IF;

    IF MOD(num, 2) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('Even Number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Odd Number');
    END IF;
END;
/
