<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="second" method="GET">
    Name: <input name="username" />
    <br><br>
    Last Name : <input name="lastname"/>
    <br><br>
    Email:<input name="email"/>
    <br><br>
    Password: <input type="password" name="pass">
    <br><br>
    Gender: <input type="radio" name="gender" value="female" checked />Female
    <input type="radio" name="gender" value="male" />Male
    <br><br>
    Country: <select name="country">
    <option>Germany</option>
    <option>Poland</option>
    <option>Belarus</option>
    <option>Russian</option>
    <option>Ukraine</option>
    <option>Lithuania</option>
    <option>Latvia</option>
</select>
    <br><br>
    Courses:
    <br>
    <input type="checkbox" name="courses" value="JavaSE" checked />Java SE
    <input type="checkbox" name="courses" value="JavaFX" checked />Java FX
    <input type="checkbox" name="courses" value="JavaEE" checked />Java EE
    <br>
    <input type="checkbox" name="courses" value="Python" checked />Python
    <input type="checkbox" name="courses" value="C+" checked />C+
    <input type="checkbox" name="courses" value="C#" checked />C#
    <br>
    <input type="checkbox" name="courses" value="Angular" checked />Angular
    <input type="checkbox" name="courses" value="Scala" checked/>Scala
    <input type="checkbox" name="courses" value="AQA Java" checked />AQA Java
    <br>
    <input type="checkbox" name="courses" value="IOs" checked />IOs
    <input type="checkbox" name="courses" value="WEB dev" checked />WEB dev
    <input type="checkbox" name="courses" value="JavaScript" checked />JavaScript
    <br><br>
    <input type="submit" value="Submit" />
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="first-servlet">First Servlet</a>
<br/>
<p><a href="initParam">Support</a></p>
<br/>
<h5><a href="mailto:veles.mk.12@gmail.com">Send Message To Us</a> </h5>
</body>
</html>