Spring Data Rest
no REST Controller required
no DAO required
added spring-data-rest starter dependency and all endpoints are provided by spring
APIS are HATEOAS compliant

Required for SPRING DATA REST to work 
JpaRepository- EmployeeRepository implements JpaRepository<Employee,Integer>
Entity- Employee
dependency in pom.xml

APIS provided
GET /employees
GET /employees/{employeeId}
POST /employees
PUT /employees/{employeeId}
DELETE /employees/{employeeId}


Add @RepositoryRestResource(path="members") to give custom name to rest api
Pagination-
-http://localhost:3000/api/members?page=0
-http://localhost:3000/api/members?page=1
Sorting By default asc
http://localhost:3000/api/members?sort=firstName,desc
http://localhost:3000/api/members?sort=lastName,firstName,asc
