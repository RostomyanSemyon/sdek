<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<br/>
<form  action="/addUser" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <input type="submit" value="Add user">
</form>
<br/>
<br/>
<form action="/users" method="get">
    <input type="submit" value="users list">
</form>
<form  action="/findUsers" method="get">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <input type="submit" value="search">
</form>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <#if users??>
        <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
        </tr>
        </#list>
    </#if>
</table>
</body>
</html>