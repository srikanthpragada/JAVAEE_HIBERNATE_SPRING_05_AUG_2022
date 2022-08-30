
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:setDataSource 
    var="mysql" 
    driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/hr" 
	user="root" 
	password="mysql" />
