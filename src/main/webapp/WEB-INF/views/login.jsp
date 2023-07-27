<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>User Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Login</title>
    </head>
    <body>
   
        <div class="container">
            <h3 id="form_header" class="text-warning" align="center"><a class="navbar-brand" href="#">Login</a></h3>
            <div> </div>
     
            <!-- User input form to validate a user -->
            <c:url var="validateUrl" value="/user/validate" />
            <form id="user_form" action="login" method="POST">
                <div class="form-group">
                    <label for="name">UserName</label>
                    <input type="text" class="form-control" id="name"  name="username" required>
                </div>
                <div class="form-group">
                    <label for="pwd">Password</label>
                    <input type="password" class="form-control" id="pwd"  name="password" required>
                </div>
                <button id="confirm_user" type="submit" class="btn btn-primary">Login</button>
                <a href="register" class="btn btn-success">New User</a>
            </form>
        </div>
    </body>
</html>