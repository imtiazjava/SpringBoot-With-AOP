
Hibernate has provided 3 ways to retreive the multiple records:

1. HQL
2. Criteria API
3. Native SQL


HQL:
----

SQL                                        HQL

select * from employee;                  from Employee 

---------------------------------------------------------------------------------------------------------------------------------------
Spring AOP:
-----------

AOP(Aspect Oriented Programming):
----------------------------------
-It is programming technique that separetes system services(concerns)
 from the business logic.


-System Services(Concerns)  like logging , transaction management, excpetions, security ,encoding,decoding,,,,etc...
-This system services are commonly referred to as "cross cutting concerns"



-Business logic  which follow the business rules which is given by the client.




Cross-Cutting Concerns:
------------------------
We can Move additional services of a project into the other classes
(Services class/Aspect) and bind when ever we required.


Aspect:
-------
Aspect is a class that provides additional services to the project
   like (transaction management, logging,security,encoding and deconding etc..)

*  
Aspect is system services(transaction management, logging,security,encoding and deconding etc..) which is written in sepearte class.


Advice:
-------
-Is a implementation of Aspect.
*
-It is a method inside the Aspect class.

-It define the  job that an aspect will perform i.e advice defines
both what and when of an aspect.


Advice Type               descritption
---------------------------------------
Before                   -Called before target method is invoked.

Excution Flow:
--------------
    adviceMethod() - first execute
    bLMethod()     - second execute


After                    -Called after target method returns regardless of the outcome.

Excution Flow:
--------------
    bLMethod()     - first execute
    adviceMethod() - second execute


Around                   -Both Before and After target method executed.

Excution Flow:
--------------

    adviceMethod() - first execute
        blMethod()     - second execute
    adviceMethod() - third execute


After-returning          -Called after target completes successfully.

Excution Flow:
--------------

        After excuting the blMethod() only on successfully compleation then only
               execute  the  adviceMethod()
   
After-throwing           -Called when  target method throws an exception

Excution Flow:
--------------
        After excuting the blMethod() if blMethod() is throwing the exception then
         execute the adviceMethod()


Target:
-------
-The target class is a busniess component which is being advised.

*
It is pure business logic class which is having BL but without
services(logging,exception,.....)


Proxy:
------
A proxy is the object at runtime after applying advices to the  target object.



joinpoint:
-----------

-The point where services is merged is called as joinpoint


Pointcut:
---------
-A pointcut defines at what joinpoints advice should be applied.
*
-It is an expression language of AOP that matches  joinpoints.
*
-It is an expression , it will select blMethod() which needs advices.

 syntax:
 -------
  AccessSpecifier/modifer RetunType Package.className.MethodName(Arguments)

eg: public  void com.cgi.main.dao.EmployeeDAO.saveEmployee(Employee emp)

  1.
    public * *() 
    
     -zero arguments, any  method name and any return type.

  2. public void *(..)
    
     -It indicate two dots any no of/types of arguments,
     -Any method name
     -return type as void only
     -public as access modifier

  3. public * com.cgi.dao.EmployeeDAO.*(..)

     -It indicate two dots i.e any no of types arguments,
     - Any method name which is define inside the com.cgi.dao.EmployeeDAO package
     -Any return type
     -public as access modifier


  4. public * com.cgi.main.*.*(..)


