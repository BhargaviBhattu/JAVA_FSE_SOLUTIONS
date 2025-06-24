CREATE TABLE employee (
   emp_id      NUMBER PRIMARY KEY,
   emp_name    VARCHAR2(50),
   salary      NUMBER,
   bonus       NUMBER
);

     /* PROCEDURE CREATION */

CREATE OR REPLACE PROCEDURE add_employee (
   p_id     IN NUMBER,
   p_name   IN VARCHAR2,
   p_salary IN NUMBER
) IS
   v_bonus NUMBER;
BEGIN
   IF p_salary > 50000 THEN
      v_bonus := p_salary * 0.10;
   ELSE
      v_bonus := p_salary * 0.05;
   END IF;

   INSERT INTO employee (emp_id, emp_name, salary, bonus)
   VALUES (p_id, p_name, p_salary, v_bonus);

   DBMS_OUTPUT.PUT_LINE('Employee added with bonus: ' || v_bonus);
EXCEPTION
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
 
SET SERVEROUTPUT ON;

BEGIN
   add_employee(1, 'Bhargavi', 60000);
   add_employee(2, 'Upasika', 45000);
   add_employee(3, 'Ankitha', 75000);
   add_employee(4, 'Navya', 30000);
   add_employee(5, 'Prema', 52000);
END;
/


SELECT * FROM employee;
