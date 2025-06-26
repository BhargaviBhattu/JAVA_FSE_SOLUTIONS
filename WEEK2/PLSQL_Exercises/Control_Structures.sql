/*   IF ELSE STATEMENT  */
declare
    age number := &age; 
begin
    if age >= 18 then
        dbms_output.put_line('you are eligible to vote.');
    else
        dbms_output.put_line('you are not eligible to vote.');
    end if;
end;
/

/*    IF-THEN-ELSIF STATEMENT   */
  declare
   salary number := &salary;
begin
   if salary >= 100000 then
      dbms_output.put_line('category: executive');
   elsif salary >= 70000 then
      dbms_output.put_line('category: senior employee');
   elsif salary >= 40000 then
      dbms_output.put_line('category: mid-level employee');
   else
      dbms_output.put_line('category: junior employee');
   end if;
end;
/
  
/*   CASE STATEMENT   */
 declare
    marks number := &marks;
begin
    case 
        when marks >= 90 then
            dbms_output.put_line('grade: a');
        when marks >= 80 then
            dbms_output.put_line('grade: b');
        when marks >= 70 then
            dbms_output.put_line('grade: c');
        when marks >= 60 then
            dbms_output.put_line('grade: d');
        else
            dbms_output.put_line('grade: f');
    end case;
end;
/
    
/*  LOOP  */
DECLARE
    i NUMBER := 1;
BEGIN
    LOOP
        EXIT WHEN i > 5;
        DBMS_OUTPUT.PUT_LINE('Number: ' || i);
        i := i + 1;
    END LOOP;
END;
    
  
/*  FOR LOOP   */
declare 
n number:=&n;
begin
    for i in 1..100 loop

        if mod(i, n) != 0 then
            goto continue_loop;  
        end if;

        dbms_output.put_line(i || ' is a multiple of' || n);

<<continue_loop>>
        null;

    end loop;
end
/

/*   WHILE LOOP   */
declare
    num number := 56;
    flag boolean := true;
begin
    while flag loop
        if mod(num, 2) = 0 then
            dbms_output.put_line(num || ' is even');
        else
            dbms_output.put_line(num || ' is odd');
        end if;
        flag := false;
    end loop;
end;

/*   GOTO AND EXIT   */
begin
    for i in 1..10 loop

        if mod(i, 2) = 0 then
            goto skip_even; 
        end if;

        if i < 10 then
            exit;
        end if;

        dbms_output.put_line(i || ' is odd');

<<skip_even>>
        null;

    end loop;
end;
/






