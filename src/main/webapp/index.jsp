<html>
<body>
<style>
    form
    {
         margin: 0 auto;
         width:250px;
    }
    input
    {
        width:250px
    }
    div
    {
        width:250px
    }
</style>
    <form action="userProfile" method="post">
        <fieldset>
            <legend>User Profiler:</legend>
        First name:<input type="text" name="firstname">
        <br>
        Last name:<input type="text" name="lastname">
        <br>
        Age:<input type="number" name="age" min="18" max="150">
        <br>
        City:<input type="text" name="city">
        <br>
        County:<input type="text" name="county">
        <br><br>
        <input type="submit" value="Submit">
        </fieldset>
    </form>
<br><br>
<%
    String result = (String) request.getSession().getAttribute("result");
    if(result != null){%>
<div class="alert alert-info">
    <strong><%=result%></strong>
</div>
<%
    }
%>
<br><br>
</body>
</html>
