SELECT E.EMPLOYEE_ID,E.FIRST_NAME,E.LAST_NAME,D.DEPARTMENT_NAME,L.COUNTRY_ID
FROM HR.EMPLOYEES E, HR.DEPARTMENTS D, HR.LOCATIONS L
WHERE E.DEPARTMENT_ID=D.DEPARTMENT_ID AND L.LOCATION_ID=D.LOCATION_ID;
