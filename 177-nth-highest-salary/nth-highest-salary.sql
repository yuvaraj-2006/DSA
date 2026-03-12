CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare num int;
  set num=N-1;
  RETURN (
      SELECT distinct salary 
      from Employee 
      order by salary desc 
       LIMIT num,1
  );
END