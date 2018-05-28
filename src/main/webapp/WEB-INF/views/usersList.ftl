<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<form  action="/addUser" method="post">
    <p>Name</p>
    <input title="Name" type="text" name="name">
    <input type="submit" value="Add user">
</form>
<h1>Users list</h1>
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
<#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
    </tr>
</#list>
</table>
</body>
</html>